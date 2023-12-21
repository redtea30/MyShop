package com.store.system.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store.system.model.Roles;
import com.store.system.service.RolesService;
import com.store.system.mapper.RolesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jksps
 * @description 针对表【roles】的数据库操作Service实现
 * @createDate 2023-12-20 17:30:35
 */
@Service
public class RolesServiceImpl extends ServiceImpl<RolesMapper, Roles>
        implements RolesService {

    @Autowired
    private RolesMapper rolesMapper;

    @Override
    public List<Roles> listRoles(QueryWrapper<Roles> queryWrapper) {
        return rolesMapper.selectList(queryWrapper);    }

    @Override
    public Roles getRoleById(Integer id) {
        if (id != null) {
            return rolesMapper.selectById(id);
        }
        return null;
    }

    @Override
    public boolean updateRole(Roles roles) {
        if (roles!= null) {
            return rolesMapper.updateById(roles) > 0;
        }
        return false;
    }

    @Override
    public boolean saveRole(Roles roles) {
        if (roles!= null) {
            return rolesMapper.insert(roles) > 0;
        }
        return false;
    }

    @Override
    public boolean removeRoleById(Integer id) {
        if (id!= null) {
            return rolesMapper.deleteById(id) > 0;
        }
        return false;
    }
}




