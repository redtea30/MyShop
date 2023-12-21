package com.store.system.controller;

import com.store.common.util.Result;
import com.store.system.model.Menu;
import com.store.system.service.MenuService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Package-name: com.store.system.controller
 * Project-name: MyShop
 * Author: Neko
 * 21-12-2023  20:41
 * Describe：
 */
@RestController
@RequestMapping("/system/menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping
    @ApiOperation(value = "获取所有菜单信息", notes = "获取所有菜单信息")
    public Result getMenu(@ApiParam(name = "menu", value = "菜单信息") Menu menu) {
//        throw new RuntimeException("模拟异常");
        return Result.ok(menuService.treeList(menu));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取菜单信息", notes = "根据id获取菜单信息")
    public Result getMenuById(@ApiParam(name = "id", value = "菜单id", required = true) @PathVariable Integer id) {
        return Result.ok(menuService.getById(id));
    }


    @PostMapping
    @ApiOperation(value = "根据id修改菜单信息", notes = "根据id修改菜单信息")
    public Result updateMenuById(@ApiParam(name = "menu", value = "菜单信息", required = true) Menu menu) {
        return Result.ok(menuService.updateById(menu));
    }


    @PutMapping
    @ApiOperation(value = "新增菜单信息", notes = "新增菜单信息")
    public Result addMenu(@ApiParam(name = "menu", value = "菜单信息", required = true) Menu menu) {
        return Result.ok(menuService.save(menu));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除菜单信息", notes = "根据id删除菜单信息")
    public Result deleteMenuById(@ApiParam(name = "id", value = "菜单id", required = true) @PathVariable Integer id) {
        return Result.ok(menuService.removeById(id));
    }

}
