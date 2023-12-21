package com.store.system.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import com.store.common.model.BaseModel;
import lombok.Data;

/**
 * 
 * @TableName roles
 */
@TableName(value ="roles")
@Data
public class Roles extends BaseModel implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Integer roleId;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色标识
     */
    private String roleIdentifier;

    /**
     * 角色状态：0（Inactive）或1（Active）
     */
    private Integer roleStatus;

    /**
     * 备注
     */
    private String roleNotes;

    /**
     * 创建人ID
     */
    private Integer createdById;

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