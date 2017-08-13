package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);}

	@RequestMapping("/hello")
	public String sayhello() {
		return "hello from SPRING";
	}

	@RequestMapping("/Mluleki")
	public String sayMyName(){
		return "Mluleki is my name";
	}
}
