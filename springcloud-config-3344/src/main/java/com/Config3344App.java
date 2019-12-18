package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
/**
 * @author XianFeiyue
 * @description
 */
@SpringBootApplication
@EnableConfigServer
public class Config3344App {
    public static void main(String[] args) {
        SpringApplication.run(Config3344App.class,args);
    }
}