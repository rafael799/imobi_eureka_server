package com.imobi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ImobiEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImobiEurekaServerApplication.class, args);
	}

}
