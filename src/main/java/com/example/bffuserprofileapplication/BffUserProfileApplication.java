package com.example.bffuserprofileapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.example.bffuserprofileapplication.client")
public class BffUserProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(BffUserProfileApplication.class, args);
	}

}