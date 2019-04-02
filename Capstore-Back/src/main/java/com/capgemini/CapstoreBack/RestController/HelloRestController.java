package com.capgemini.CapstoreBack.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.CapstoreBack.service.IHelloService;

@RestController
public class HelloRestController {

	@Autowired
	IHelloService helloservice;
	
	@RequestMapping(value="helloback")
	public String getMessage() {
		return helloservice.getMessage();
	}
	
}
