package com.store.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.store.common.util.Result;
import com.store.system.model.Users;
import com.store.system.service.UsersService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Package-name: com.store.system.controller
 * Project-name: MyShop
 * Author: Neko
 * 21-12-2023  22:14
 * Describe：
 */
@RestController
@RequestMapping("/system/user")
public class UserController {
    @Autowired
    private UsersService userService;
    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/login")
    @ApiOperation(value = "获取登录用户信息", notes = "获取登录用户信息")
    public Result login(@RequestBody Users users) {
        String token = userService.login(users);
        return Result.ok("登陆成功").put("token", token);
    }

    @GetMapping
    @ApiOperation(value = "获取所有用户信息", notes = "获取所有用户信息")
    public Result getGoods(@ApiParam(name = "user", value = "用户信息") Users user) {
//        throw new RuntimeException("模拟异常");
        // 构建查询条件
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtils.isEmpty(user.getUsername())) {
            queryWrapper.like("name", user.getUsername());
        }
        if (!ObjectUtils.isEmpty(user.getUsername())) {
            queryWrapper.eq("username", user.getUsername());
        }
        // 分页
        PageHelper.startPage(user.getPage(), user.getSize());
        return Result.ok(userService.list(queryWrapper));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取用户信息", notes = "根据id获取用户信息")
    public Result getGoodsById(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable Integer id) {
        return Result.ok(userService.getById(id));
    }


    @PostMapping
    @ApiOperation(value = "根据id修改用户信息", notes = "根据id修改用户信息")
    public Result updateGoodsById(@ApiParam(name = "user", value = "用户信息", required = true) @RequestBody Users user) {
        return Result.ok(userService.updateById(user));
    }


    @PutMapping
    @ApiOperation(value = "新增用户信息", notes = "新增用户信息")
    public Result addGoods(@ApiParam(name = "user", value = "用户信息", required = true) @RequestBody Users user) {
        return Result.ok(userService.save(user));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除用户信息", notes = "根据id删除用户信息")
    public Result deleteGoodsById(@ApiParam(name = "id", value = "用户id", required = true) @PathVariable Integer id) {
        return Result.ok(userService.removeById(id));
    }


}
