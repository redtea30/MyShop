package com.store.system.service.impl;

import cn.hutool.core.lang.tree.Tree;
import cn.hutool.core.lang.tree.TreeNodeConfig;
import cn.hutool.core.lang.tree.TreeUtil;
import cn.hutool.core.lang.tree.parser.NodeParser;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.store.system.model.Menu;
import com.store.system.service.MenuService;
import com.store.system.mapper.MenuMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jksps
 * @description 针对表【menu】的数据库操作Service实现
 * @createDate 2023-12-20 17:30:34
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu>
        implements MenuService {





    @Override
    public List<Tree<Integer>> treeList(Menu menu) {
        System.out.println("进入treeList方法");
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        if (!ObjectUtil.isEmpty(menu) && !ObjectUtil.isEmpty(menu.getMenuName())) {
            queryWrapper.like("menu_name", menu.getMenuName());
        }
        queryWrapper.orderByAsc("parent_id", "display_order");

        List<Menu> menus = baseMapper.selectList(queryWrapper);
        // 这里直接就执行查询操作，并且返回结果集，超级先进
        System.out.println(menus.stream().toList());

        // 配置
        TreeNodeConfig treeNodeConfig = new TreeNodeConfig();
        // 设置最大递归深度
        treeNodeConfig.setDeep(2);


        List<Tree<Integer>> build = TreeUtil.<Menu, Integer>build(menus, 0, treeNodeConfig, new NodeParser<Menu, Integer>() {
            @Override
            public void parse(Menu treeNodes, Tree<Integer> tree) {
                tree.setId(treeNodes.getMenuId());
                tree.setParentId(treeNodes.getParentId());
                tree.setName(treeNodes.getMenuName());
                // 额外添加字段
                tree.putExtra("url", treeNodes.getMenuUrl());
                tree.putExtra("menuType", treeNodes.getMenuType());
                tree.putExtra("displayOrder", treeNodes.getDisplayOrder());
            }
        });

        return build;
    }
}




