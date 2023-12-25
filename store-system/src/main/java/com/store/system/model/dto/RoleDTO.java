package com.store.system.model.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import com.store.system.model.Menu;
import com.store.system.model.Roles;
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
public class RoleDTO extends Roles implements Serializable {

    @TableField(exist = false)
    private List<Menu> menus;
}