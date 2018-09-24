package com.example.orderdetailsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.io.IOException;


@SpringBootApplication
public class OrderDetailsServiceApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(OrderDetailsServiceApplication.class, args);
	}
}
