package com.store.shopProduct.controller;

import com.alibaba.fastjson.JSON;
import com.store.shopProduct.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Package-name: com.store.shopProduct
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  18:29
 * Describe：
 */

@RestController
@Slf4j
@RequestMapping("/product")
public class ProductController {
    @Resource
    private ProductService productService;
    @GetMapping("/find/{id}")
    public Product findByPid(@PathVariable("id") Integer pid) {
        log.info("接下来要进行{}号商品信息的查询", pid);
        Product pro = productService.findByPid(pid);
        log.info("商品信息查询成功,内容为{}", JSON.toJSONString(pro));
        return pro;
    }
}