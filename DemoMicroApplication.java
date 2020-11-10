package com.gnp.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gnp")
@EnableFeignClients("com.gnp")
@EnableDiscoveryClient
public class DemoMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMicroApplication.class, args);
	}

}
