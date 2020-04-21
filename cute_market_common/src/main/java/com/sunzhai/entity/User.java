package com.sunzhai.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author zhai
 * @since 2020-04-20
 */
@Data
@EqualsAndHashCode
@Accessors(chain = true)
@TableName("cute_user")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cute_id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户昵称
     */
    @TableField("cute_nickname")
    private String nickname;

    /**
     * 用户账号
     */
    @TableField("cute_username")
    private String username;

    /**
     * 用户密码
     */
    @TableField("cute_password")
    private String password;

    /**
     * 加密盐
     */
    @TableField("cute_salt")
    private String salt;

    /**
     * 用户头像
     */
    @TableField("cute_image_url")
    private String imageUrl;

    /**
     * 用户电话
     */
    @TableField("cute_phone")
    private String phone;

    /**
     * 用户等级
     */
    @TableField("cute_member_level")
    private Long memberLevel;


}
