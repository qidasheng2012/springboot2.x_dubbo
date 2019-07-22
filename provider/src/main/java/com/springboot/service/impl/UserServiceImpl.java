package com.springboot.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.stereotype.Component;

/**
 * @author qp
 * @date 2019/7/22 10:25
 */
@Component
@Service(timeout = 10000, interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        User user = User.builder()
                .id(1)
                .name("张三")
                .age(23)
                .build();

        return user;
    }
}
