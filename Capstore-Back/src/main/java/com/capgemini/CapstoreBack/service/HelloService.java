package com.capgemini.CapstoreBack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capgemini.CapstoreBack.Repository.IHelloRepository;

@Service
public class HelloService implements IHelloService {
	
	@Autowired
	IHelloRepository helloRepo;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return helloRepo.getMessage();
	}

}
