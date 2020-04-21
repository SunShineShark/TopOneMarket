package com.sunzhai.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sunzhai.annotation.DubboService;
import com.sunzhai.entity.User;
import com.sunzhai.mapper.UserMapper;
import com.sunzhai.service.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhai
 * @since 2020-04-20
 */
@DubboService
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
