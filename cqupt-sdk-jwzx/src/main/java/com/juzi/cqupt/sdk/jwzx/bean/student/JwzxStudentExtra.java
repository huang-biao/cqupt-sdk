package com.juzi.cqupt.sdk.jwzx.bean.student;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * 学生额外信息
 *
 * @author Juzi - https://juzibiji.top
 * @since 2019/8/1 19:14
 */
@Data
@Accessors(chain = true)
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class JwzxStudentExtra extends JwzxStudent {

    /**
     * 邮箱
     */
    private String email;

    /**
     * 统一认证码
     */
    private String unionId;

}
