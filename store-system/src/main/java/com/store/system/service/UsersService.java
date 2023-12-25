package com.store.system.service;

import com.store.system.model.Users;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

/**
* @author jksps
* @description 针对表【users(用户信息表)】的数据库操作Service
* @createDate 2023-12-20 17:30:35
*/
public interface UsersService extends IService<Users> {

    public String login(Users users);

}
