package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * @author XianFeiyue
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAdminServer
public class Admin8084App {

	public static void main(String[] args) {
		SpringApplication.run(Admin8084App.class, args);
	}
}
