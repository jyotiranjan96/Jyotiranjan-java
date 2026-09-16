package com.jyotiranjan.finverse_bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // Changed from @EnableEurekaServer
public class FinverseBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinverseBankApplication.class, args);
	}

}
