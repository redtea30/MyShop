package com.storeAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Package-name: com.storeAdmin
 * Project-name: MyShop
 * Author: Neko
 * 16-12-2023  14:07
 * Describe：
 */

@SpringBootApplication
public class StoreAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreAdminApplication.class, args);
        System.out.println("启动了storeadmin");
    }
}
