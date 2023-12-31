package com.store.system.mapper;

import com.store.system.model.Roles;
import com.store.system.model.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @author jksps
 * @description 针对表【user_role】的数据库操作Mapper
 * @createDate 2023-12-20 17:30:35
 * @Entity com.store.system.model.UserRole
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    List<Roles> selectRoleIdsByUserId(Integer userId);

}




