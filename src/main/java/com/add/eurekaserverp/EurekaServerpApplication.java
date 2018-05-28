package com.add.eurekaserverp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerpApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerpApplication.class, args);
	}
}
