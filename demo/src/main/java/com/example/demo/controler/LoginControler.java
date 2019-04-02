package com.example.demo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginControler {

	@RequestMapping(value="/")
	public String login() {
		return "Login";
	}
	@RequestMapping(value="loginmap")
	public String logindata(@RequestParam("name") String name,@RequestParam("pass") String pass,ModelMap m) {
		System.out.println("name:"+name);
		m.addAttribute("firstname",name);
		m.addAttribute("password",pass);
		return "logindata";
	}
}
