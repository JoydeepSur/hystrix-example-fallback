package com.example.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/hystrix")
public class HelloController {

	@Autowired
	RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "fallback")
	@GetMapping
	public String hello() {
		String url="http://localhost:8080/dummy";
		return restTemplate.getForObject(url, String.class);
	}
	
	public String fallback () {
		return "Calling fallback method!!!";
	}
}
