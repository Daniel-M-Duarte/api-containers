package com.example.demo;

import com.example.demo.util.ContainerNumValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiContainersApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiContainersApplication.class, args);

		String test = "ASSS14567";

		System.out.println(ContainerNumValidator.validator(test));
	}

}
