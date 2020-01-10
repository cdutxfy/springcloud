package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin.server.EnableZipkinServer;

/**
 * @author XianFeiyue
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class Zipkin9411App {

	public static void main(String[] args) {
		SpringApplication.run(Zipkin9411App.class, args);
	}
}
