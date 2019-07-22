package com.springboot.entity;

import lombok.*;

import java.io.Serializable;

/**
 * 用户
 *
 * @author qp
 * @date 2019/7/22 10:10
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class User implements Serializable {
    // 主键id
    private Integer id;
    // 姓名
    private String name;
    // 年龄
    private Integer age;
}
