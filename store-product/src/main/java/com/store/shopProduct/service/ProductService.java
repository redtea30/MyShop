package com.store.shopProduct.service;

import model.Product;

/**
 * Package-name: com.store.shopProduct.service
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  18:29
 * Describe：
 */

public interface ProductService {
    //根据pid查询商品信息
    Product findByPid(Integer pid);
}
