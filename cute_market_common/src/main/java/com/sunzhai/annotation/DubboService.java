package com.sunzhai.annotation;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhai
 * @date 2020年4月21日21:11:37
 * dubbo服务注解,可同时被dubbo和普通springboot调用
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Service
@Component
public @interface DubboService {
}
