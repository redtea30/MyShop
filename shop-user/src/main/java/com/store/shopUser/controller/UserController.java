package com.store.shopUser.controller;

import com.alibaba.fastjson.JSON;
import com.store.shopUser.service.UserService;
import lombok.extern.slf4j.Slf4j;
import model.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Package-name: controller
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  14:19
 * Describe：
 */

@RestController
@Slf4j
@RequestMapping(method = RequestMethod.GET, value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/find/{id}")
    public User findByUid(@PathVariable("id") Integer uid) {
        System.out.println(uid + "接受到了");
        log.info("接下来要进行{}号用户信息的查询", uid);
        User user = userService.findById(uid);
        log.info("用户信息查询成功,内容为{}", JSON.toJSONString(user));
        return user;
    }
}
