package com.store.system.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

import com.store.common.model.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @TableName menu
 */
@TableName(value = "menu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu extends BaseModel implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer menuId;

    /**
     * 名称
     */
    private String menuName;

    /**
     * URL
     */
    private String menuUrl;

    /**
     * 权限标识
     */
    private String permissionIdentifier;

    /**
     * 类型：0（目录）、1（菜单）、2（按钮）
     */
    private Integer menuType;

    /**
     * 父菜单ID
     */
    private Integer parentId;

    /**
     * 排序号
     */
    private Integer displayOrder;

    /**
     * 图标
     */
    private String icon;

    /**
     * 状态：0（禁用）或1（启用）
     */
    private Integer menuStatus;

/*    *//**
     * 创建时间
     *//*
    private Date createdAt;

    *//**
     * 修改时间
     *//*
    private Date updateAt;*/

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}