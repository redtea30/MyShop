package com.store.shopUser.service;

import model.User;

/**
 * Package-name: service
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  14:22
 * Describe：
 */
public interface UserService {
    User findById(Integer id);
}
