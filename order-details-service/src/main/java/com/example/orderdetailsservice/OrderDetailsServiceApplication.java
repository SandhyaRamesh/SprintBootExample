package com.example.orderdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.io.IOException;


@EnableEurekaClient
@SpringBootApplication
public class OrderDetailsServiceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OrderDetailsServiceApplication.class, args);
	}
}
