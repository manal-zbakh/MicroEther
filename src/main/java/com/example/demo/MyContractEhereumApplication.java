package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class MyContractEhereumApplication {
    @LoadBalanced
	public static void main(String[] args) {
		SpringApplication.run(MyContractEhereumApplication.class, args);
	}

}
