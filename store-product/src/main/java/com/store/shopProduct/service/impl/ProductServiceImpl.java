package com.store.shopProduct.service.impl;

import com.store.shopProduct.service.ProductService;
import model.Product;
import org.springframework.stereotype.Service;

/**
 * Package-name: com.store.shopProduct.service.impl
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  18:30
 * Describe：
 */

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public Product findByPid(Integer pid) {
// TODO 数据库 查询数据
        Product product = new Product();
        product.setId(1);
        product.setName("华为手机");
        product.setStock(100);
        product.setPrice(1000.00);
        product.setDescription("遥遥领先的智能手机");
        return product;
    }
}
