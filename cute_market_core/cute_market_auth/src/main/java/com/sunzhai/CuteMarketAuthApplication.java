package com.sunzhai;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = {"com.sunzhai.auth.mapper"})
public class CuteMarketAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CuteMarketAuthApplication.class, args);
    }

}
