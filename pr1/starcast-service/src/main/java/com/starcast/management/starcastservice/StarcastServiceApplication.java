package com.starcast.management.starcastservice;

import com.starcast.management.starcastservice.entity.ResponseTemplateVO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class StarcastServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarcastServiceApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
