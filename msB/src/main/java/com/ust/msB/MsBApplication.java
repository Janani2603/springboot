package com.ust.msB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsBApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBApplication.class, args);
	}

}
