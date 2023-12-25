package com.store.system.service.impl;

import com.store.system.model.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Package-name: com.store.system.service.impl
 * Project-name: MyShop
 * Author: Neko
 * 22-12-2023  17:12
 * Describe：
 */
@SpringBootTest
class UsersServiceImplTest {
    @Autowired
    UsersServiceImpl usersService;

    @Test
    void save() {
        Users users = new Users();
        users.setUsername("test");
        users.setPassword("123456");
        users.setEmail("");
        users.setPhone("1234567890");
        users.setNickname("test");
        users.setAvatarUrl("http://127.0.0.1:8083/avatar/123456.jpg");
        users.setStatus(1);
        boolean save = usersService.save(users);
        System.out.println(save);
    }
}