package com.store.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store.system.model.UserRole;
import com.store.system.service.UserRoleService;
import com.store.system.mapper.UserRoleMapper;
import org.springframework.stereotype.Service;

/**
* @author jksps
* @description 针对表【user_role】的数据库操作Service实现
* @createDate 2023-12-20 17:30:35
*/
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole>
    implements UserRoleService{

}




