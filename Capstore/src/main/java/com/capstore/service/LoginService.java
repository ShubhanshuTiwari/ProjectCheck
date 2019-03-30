package com.capstore.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstore.bean.LoginBean;
import com.capstore.repo.ILoginRepo;

@Service
@Transactional
public class LoginService {
	
	@Autowired
	ILoginRepo loginrepo;
	public LoginBean saveMyUser(LoginBean bean) {
		return loginrepo.save(bean);
	}
	
	public List<LoginBean> findAll(){
		System.out.println("Service");
		return loginrepo.findAll();
		
	}
}
