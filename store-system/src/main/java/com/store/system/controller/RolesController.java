package com.store.system.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.store.system.model.Roles;
import com.store.system.service.RolesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import com.store.common.util.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * Package-name: com.store.system.controller
 * Project-name: MyShop
 * Author: Neko
 * 20-12-2023  20:17
 * Describe：
 */

@RestController
@RequestMapping("/system/roles")
public class RolesController {

    @Autowired
    private RolesService roleService;

    @GetMapping
    @ApiOperation(value = "获取所有角色信息", notes = "获取所有角色信息")
    public Result getRoles(@ApiParam(name = "roles", value = "角色信息") Roles roles) {
//        throw new RuntimeException("模拟异常");
        // 构建查询条件
        QueryWrapper<Roles> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtils.isEmpty(roles.getRoleName())) {
            queryWrapper.like("name", roles.getRoleName());
        }
        // 分页
        //没整明白，先不分页
        /*PageHelper.startPage(roles.getPage(), roles.getSize());*/
        return Result.ok(roleService.list(queryWrapper));
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "根据id获取角色信息", notes = "根据id获取角色信息")
    public Result getRolesById(@ApiParam(name = "id", value = "角色id", required = true) @PathVariable Integer id) {
        return Result.ok(roleService.getById(id));
    }


    @PostMapping
    @ApiOperation(value = "根据id修改角色信息", notes = "根据id修改角色信息")
    public Result updateRolesById(@ApiParam(name = "roles", value = "角色信息", required = true) Roles roles) {
        return Result.ok(roleService.updateById(roles));
    }


    @PutMapping
    @ApiOperation(value = "新增角色信息", notes = "新增角色信息")
    public Result addRoles(@ApiParam(name = "roles", value = "角色信息", required = true) @RequestBody Roles roles) {
        return Result.ok(roleService.save(roles));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "根据id删除角色信息", notes = "根据id删除角色信息")
    public Result deleteRolesById(@ApiParam(name = "id", value = "角色id", required = true) @PathVariable Integer id) {
        return Result.ok(roleService.removeById(id));
    }


}
