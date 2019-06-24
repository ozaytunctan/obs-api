package com.obs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ObsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObsApiApplication.class, args);
	}

}
