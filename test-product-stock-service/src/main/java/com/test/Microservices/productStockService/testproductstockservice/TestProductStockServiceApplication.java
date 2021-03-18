package com.test.Microservices.productStockService.testproductstockservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class TestProductStockServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProductStockServiceApplication.class, args);
	}

}
