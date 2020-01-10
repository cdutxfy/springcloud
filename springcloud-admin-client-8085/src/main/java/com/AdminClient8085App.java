package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author XianFeiyue
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class AdminClient8085App {

	public static void main(String[] args) {
		SpringApplication.run(AdminClient8085App.class, args);
	}
}
