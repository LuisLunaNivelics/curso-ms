package com.nivelics.store.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
class CustomerserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(com.nivelics.store.customerservice.CustomerserviceApplication.class, args);
	}

}
