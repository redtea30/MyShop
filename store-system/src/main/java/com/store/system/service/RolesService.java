package com.store.system.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.store.system.model.Roles;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author jksps
* @description 针对表【roles】的数据库操作Service
* @createDate 2023-12-20 17:30:35
*/

public interface RolesService extends IService<Roles> {


 // 获取所有角色信息，可以包含条件查询
 List<Roles> listRoles(QueryWrapper<Roles> queryWrapper);

 // 根据ID获取单个角色信息
 Roles getRoleById(Integer id);

 // 更新角色信息
 boolean updateRole(Roles roles);

 // 添加新角色
 boolean saveRole(Roles roles);

 // 根据ID删除角色
 boolean removeRoleById(Integer id);
}
