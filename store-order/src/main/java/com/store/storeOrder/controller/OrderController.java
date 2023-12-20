package com.store.storeOrder.controller;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import model.Order;
import model.Product;
import model.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;

/**
 * Package-name: com.store.storeOrder.controller
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  18:40
 * Describe：
 */

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {
    @Resource
    private RestTemplate restTemplate;
    // 下单
    @RequestMapping("/prod/{pid}/{uid}")
    public Order order(@PathVariable("pid") Integer pid, @PathVariable("uid")
    Integer uid) {
        log.info("接收到{}用户的下单请求,接下来调用用户微服务查询此用户信息", uid);
// 调用用户微服务，查询用户信息
        User user = restTemplate.getForObject("http://localhost:8070/user/find/" +
                uid, User.class);
        log.info("查询到{}用户的信息,内容是:{}", uid, JSON.toJSONString(user));
        log.info("接收到{}号商品的下单请求,接下来调用商品微服务查询此商品信息", pid);
// 调用商品微服务,查询商品信息
        Product product =
                restTemplate.getForObject("http://localhost:8080/product/find/" + pid,
                        Product.class);
        log.info("查询到{}号商品的信息,内容是:{}", pid, JSON.toJSONString(product));
        Order order = new Order();
        order.setId(1);
        order.setUid(uid);
        order.setUsername(user.getUsername());
        order.setPid(pid);
        order.setPname(product.getName());
        order.setPprice(product.getPrice());
        order.setNumber(1);
// TODO 保存订单信息到 数据库
        log.info("创建订单成功,订单信息为{}", JSON.toJSONString(order));
        return order;
    }

/*    @RequestMapping("/prod2/{pid}/{uid}")
    public Order order2(@PathVariable("pid") Integer pid, @PathVariable("uid") Integer
            uid) {
        log.info("接收到{}用户的下单请求,接下来调用用户微服务查询此用户信息", uid);
// 调用用户微服务，查询用户信息
        ServiceInstance userService = discoveryClient.getInstances("user").get(0);
        userService.getHost();
        URI uri = userService.getUri();
        log.info("uri:{}", uri);
        User user = restTemplate.getForObject(uri + "/user/find/" + uid, User.class);
        log.info("查询到{}用户的信息,内容是:{}", uid, JSON.toJSONString(user));
        log.info("接收到{}号商品的下单请求,接下来调用商品微服务查询此商品信息", pid);
// 调用商品微服务,查询商品信息
        ServiceInstance productService =
                discoveryClient.getInstances("product").get(0);
        Product product = restTemplate.getForObject(productService.getUri() +
                "/product/find/" + pid, Product.class);
        log.info("查询到{}号商品的信息,内容是:{}", pid, JSON.toJSONString(product));
        Order order = new Order();
        order.setId(1);
        order.setUid(uid);
        order.setUsername(user.getUsername());
        order.setPid(pid);
        order.setPname(product.getName());
        order.setPprice(product.getPrice());
        order.setNumber(1);
// TODO 保存订单信息到 数据库
        log.info("创建订单成功,订单信息为{}", JSON.toJSONString(order));
        return order;
    }*/
}