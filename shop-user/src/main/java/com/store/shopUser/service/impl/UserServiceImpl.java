package com.store.shopUser.service.impl;

import com.store.shopUser.service.UserService;
import model.User;
import org.springframework.stereotype.Service;

/**
 * Package-name: service.impl
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  14:23
 * Describe：
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User findById(Integer id) {
        System.out.println("查询" + id);
        User user = new User();
        user.setId(1);
        user.setUsername("张三");
        user.setEmail("example@qq.com");
        user.setPhone("1234567890");
        return user;
    }
}
