package com.store.system.service.impl;

import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store.common.ex.ServiceException;
import com.store.system.mapper.MenuMapper;
import com.store.system.mapper.UserRoleMapper;
import com.store.system.model.Menu;
import com.store.system.model.Roles;
import com.store.system.model.UserRole;
import com.store.system.model.Users;
import com.store.system.service.UserRoleService;
import com.store.system.service.UsersService;
import com.store.system.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author jksps
 * @description 针对表【users(用户信息表)】的数据库操作Service实现
 * @createDate 2023-12-20 17:30:35
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
        implements UsersService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserRoleService userRoleService;
    // 导入这个是用来操作另一张表的
    @Autowired
    private UserRoleMapper userRoleMapper;

    @Autowired
    private MenuMapper menuMapper;

    // 这里只是保存单个用户的信息，或者多个，加上了事务

    @Transactional(rollbackFor = Exception.class)
    public boolean save(Users entity) {

        boolean save = super.save(entity);

        // 这里存数组是因为一个用户底下可以有多个权限可以访问的
        Integer[] roleIds = entity.getRoleIds();
        // 没有角色id直接返回
        if (ObjectUtil.isEmpty(roleIds)) {
            return save;
        }
        // 保存用户角色的信息
        ArrayList<UserRole> usersRoles = new ArrayList<>();
        for (Integer roleId : roleIds) {
            usersRoles.add(new UserRole().setUserId(entity.getId()).setRoleId(roleId));
        }

        boolean b = userRoleService.saveBatch(usersRoles);
        return save & b;
    }


    // 这个方法是存储token到redis里同时返还一份给调回者
    @Override
    public String login(Users users) {
        QueryWrapper<Users> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", users.getUsername());
        queryWrapper.eq("password", users.getPassword());

        Users user = getOne(queryWrapper);
        // 这里查不到数据，不知道为啥

        if (ObjectUtil.isEmpty(user)) {
            throw new ServiceException("用户名或密码错误");
        }

        // 生成token 这里以后换成jwt
        String token = new Random().nextLong() + "";

        redisTemplate.opsForValue().set(token, user);

        // 存用户权限的信息

        //1. 根据用户id查询角色信息
        List<Roles> roles = userRoleMapper.selectRoleIdsByUserId(user.getId());

        //2. 根据角色信息查询权限信息
        // 获取roles 的所有id
        List<Object> collect = roles.stream().map(new Function<Roles, Object>() {
            @Override
            public Object apply(Roles roles) {
                Integer roleId = roles.getRoleId();
                return roleId;
            }
        }).collect(Collectors.toList());

        if (ObjectUtil.isNotEmpty(collect)) {
            return token;
        }


        List<Menu> menus = menuMapper.selectMenuWithRoleIds(collect);

        // 将所有的权限都存到list中
        ArrayList<String> permissions = new ArrayList<>();
        for (Roles role : roles) {
            permissions.add("ROLE_" + role.getRoleIdentifier().toUpperCase());
        }
        for (Menu menu : menus) {
            permissions.add(menu.getPermissionIdentifier());
        }

        redisTemplate.opsForValue().set(token + "_permissions", permissions);
        return token;
    }
}




