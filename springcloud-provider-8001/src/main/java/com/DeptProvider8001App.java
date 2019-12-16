package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author XianFeiyue
 * @description
 */
@SpringBootApplication
//本服务启动后会自动注册进eureka服务
//@EnableEurekaClient
//@EnableDiscoveryClient
public class DeptProvider8001App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001App.class,args);
    }
}