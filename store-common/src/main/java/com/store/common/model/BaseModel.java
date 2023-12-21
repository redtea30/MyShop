package com.store.common.model;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Package-name: model.com.store.common.util.model
 * Project-name: MyShop
 * Author: Neko
 * 20-12-2023  20:30
 * Describe：
 */

@Data
public class BaseModel implements Serializable {
    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    @TableField(exist = false)
    private Integer page = 1;

    @TableField(exist = false)
    private Integer size = 5;
}
