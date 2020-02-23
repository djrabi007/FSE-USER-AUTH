package com.stackroute.keepnote;

import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableFeignClients
//@EnableAutoConfiguration(exclude={MongoAutoConfiguration.class})
public class UserAuthenticationServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserAuthenticationServiceApplication.class, args);
		
	}
}
