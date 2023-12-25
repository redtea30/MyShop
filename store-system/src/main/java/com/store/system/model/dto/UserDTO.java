package com.store.system.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.store.system.model.Users;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * Package-name: com.store.system.model.dto
 * Project-name: MyShop
 * Author: Neko
 * 22-12-2023  17:04
 * Describe：
 */
@Data
@ToString(callSuper = true)
public class UserDTO extends Users implements Serializable {
    @TableField(exist = false)
    private List<RoleDTO> roles;
}
