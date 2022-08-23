package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={
		"com.example.demo", "com.example.demo.config","com.example.demo.service","com.example.demo.model","com.example.demo.provider"})
public class SpringBootPorjectSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPorjectSecurityApplication.class, args);
	}

}
