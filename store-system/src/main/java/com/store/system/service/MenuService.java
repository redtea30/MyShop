package com.store.system.service;

import cn.hutool.core.lang.tree.Tree;
import com.store.system.model.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author jksps
* @description 针对表【menu】的数据库操作Service
* @createDate 2023-12-20 17:30:34
*/
public interface MenuService extends IService<Menu> {
    List<Tree<Integer>> treeList(Menu menu);


}
