package com.capgemini.CapstoreBack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration

@EntityScan("com.capstore.CapstoreBack.bean")
@ComponentScan("com.capstore.CapstoreBack.bean")
@ComponentScan("com.capstore.CapstoreBack.Repository")
@ComponentScan("com.capstore.CapstoreBack.RestController")
@ComponentScan("com.capstore.CapstoreBack.service")
public class CapstoreBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CapstoreBackApplication.class, args);
	}

}
