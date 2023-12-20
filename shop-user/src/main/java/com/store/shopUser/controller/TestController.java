package com.store.shopUser.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package-name: com.store.shopUser.controller
 * Project-name: MyShop
 * Author: Neko
 * 18-12-2023  16:48
 * Describe：
 */
@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = {"/test"})
    public String testController() {
        return "调用TestAPI成功";
    }
}
