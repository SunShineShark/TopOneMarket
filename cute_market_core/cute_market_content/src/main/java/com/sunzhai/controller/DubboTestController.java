package com.sunzhai.controller;

import com.sunzhai.entity.User;
import com.sunzhai.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class DubboTestController {

    @Reference
    private UserService userService;

    @RequestMapping("test")
    public void test() {
        User user = User.builder().imageUrl("http://image.xiaoazhai.com/").memberLevel(2L).password("123").build();
        userService.save(user);
    }
}
