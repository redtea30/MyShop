package com.demo.test001.demos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package-name: com.demo.test001.demos.web
 * Project-name: MyShop
 * Author: Neko
 * 25-12-2023  01:02
 * Describe：
 */
@RestController
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/login")
    public void get() {
        redisTemplate.opsForValue().set("name", "neko");
    }
}
