package com.store.system;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Package-name: com.store.system
 * Project-name: MyShop
 * Author: Neko
 * 20-12-2023  19:22
 * Describe：
 */
@SpringBootApplication(scanBasePackages = {"com.store.system", "com.store.common"})
@MapperScan("com.store.system.mapper")
public class SystemSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemSpringApplication.class, args);
    }
}
