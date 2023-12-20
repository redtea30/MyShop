package com.store.shopProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package-name: com.store.shopProduct
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  18:34
 * Describe：
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StoreProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreProductApplication.class, args);
    }
}
