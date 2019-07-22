package com.springboot.service;

import com.springboot.entity.User;

/**
 * @author qp
 * @date 2019/7/22 10:14
 */
public interface UserService {
    // 根据id获取用户信息
    User getUserById(Integer id);
}
