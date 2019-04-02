package com.capgemini.CapstoreBack.Repository;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class HelloRepository implements IHelloRepository {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "HelloBackend";
	}

}
