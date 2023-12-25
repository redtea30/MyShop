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
 * 用户信息表
 *
 * @TableName users
 */
@TableName(value = "users")
@Data
public class Users extends BaseModel implements Serializable {
    /**
     * 用户编号，主键，自增
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户名，非空
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 密码，非空
     */
    private String password;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像 URL
     */
    private String avatarUrl;

    /**
     * 用户状态，0: 激活, 1: 冻结, 2: 其他
     */
    private Integer status;

    /**
     * 逻辑删除标志，0: 未删除，1: 已删除
     */
    private Integer isDeleted;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableField(exist = false)
    private Integer[] roleIds;
}