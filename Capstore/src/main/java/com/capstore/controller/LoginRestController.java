package com.capstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capstore.bean.LoginBean;
import com.capstore.service.LoginService;

@org.springframework.web.bind.annotation.RestController
public class LoginRestController {

	@Autowired
	LoginService loginservice;
	
	@RequestMapping("resthello")
	public String hello() {
		return "hello Rest Controller";
	}
	
	@RequestMapping(method=RequestMethod.POST,value="loginsave")
//	@GetMapping("loginsave")
	public LoginBean saveUser(@RequestBody LoginBean bean) {
			System.out.println("Login save Controller");
			return loginservice.saveMyUser(bean);
	}
	@RequestMapping(method=RequestMethod.GET,value="loginview")
	public List<LoginBean> findAll(){
		System.out.println("Login Controller");
		return loginservice.findAll();
	}
	
	
}
