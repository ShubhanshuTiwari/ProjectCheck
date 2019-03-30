package com.capstore.Capstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration

@EntityScan("com.capstore.bean")
@ComponentScan("com.capstore.bean")
@ComponentScan("com.capstore.repo")
@ComponentScan("com.capstore.service")
@ComponentScan("com.capstore.controller")
public class CapstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreApplication.class, args);
	}

}
