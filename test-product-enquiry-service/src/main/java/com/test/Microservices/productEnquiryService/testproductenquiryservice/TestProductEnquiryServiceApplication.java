package com.test.Microservices.productEnquiryService.testproductenquiryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.test.Microservices.productEnquiryService")
//testproductenquiryservice
public class TestProductEnquiryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestProductEnquiryServiceApplication.class, args);

	}

}
