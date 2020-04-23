package com.example.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class HystrixExampleFallbackApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixExampleFallbackApplication.class, args);
	}

}
