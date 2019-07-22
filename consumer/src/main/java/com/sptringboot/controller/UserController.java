package com.sptringboot.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qp
 * @date 2019/7/22 10:36
 */
@RestController
@RequestMapping("/user")
public class UserController {

    //timeout 可以不指定，如果提供则有填写但是version一定要指定 不然会找不到服务 直连需要加url="dubbo://localhost:20880"
    @Reference
    private UserService userService;

    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return userService.getUserById(id);
    }
}
