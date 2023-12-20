package com.store.storeOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Package-name: com.storeAdmin
 * Project-name: MyShop
 * Author: Neko
 * 16-12-2023  14:07
 * Describe：
 */

@SpringBootApplication
@EnableDiscoveryClient
public class StoreOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(StoreOrderApplication.class, args);
        System.out.println("com.store.storeOrder.StoreOrderApplication is running...");
    }

    // 创建 RestTemplate 实例并通过 @Bean 注解注入到 IoC 容器中
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
