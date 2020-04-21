package com.sunzhai.controller;


import com.sunzhai.entity.User;
import com.sunzhai.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhai
 * @since 2020-04-20
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("user")
    public User addUser() {
        User user = User.builder().imageUrl("http://image.xiaoazhai.com/").memberLevel(2L).password("123").build();
        userService.save(user);
        return user;
    }

}

