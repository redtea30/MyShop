package com.store.system.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.store.system.model.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author jksps
* @description 针对表【menu】的数据库操作Mapper
* @createDate 2023-12-20 17:30:34
* @Entity com.store.system.model.Menu
*/
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> selectAllByMenuName(@Param("menuName") String menuName);

    int insertAll(Menu menu);
}




