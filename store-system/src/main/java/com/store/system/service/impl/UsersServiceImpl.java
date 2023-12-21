package com.store.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store.system.model.Users;
import com.store.system.service.UsersService;
import com.store.system.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author jksps
* @description 针对表【users(用户信息表)】的数据库操作Service实现
* @createDate 2023-12-20 17:30:35
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




