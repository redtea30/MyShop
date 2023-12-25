package com.store.system.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @TableName role_menu
 */
@TableName(value ="role_menu")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenu implements Serializable {
    /**
     * 角色编号
     */
    @TableId
    private Integer roleId;

    /**
     * 菜单编号
     */

    private Integer menuId;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}