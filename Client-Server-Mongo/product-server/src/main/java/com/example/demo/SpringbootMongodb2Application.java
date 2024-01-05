package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo", "com.example.demo.product"})
@EnableJpaRepositories(basePackages = "com.example.demo")
public class SpringbootMongodb2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongodb2Application.class, args);
	}

}
