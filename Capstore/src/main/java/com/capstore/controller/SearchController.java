package com.capstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchController {
	@ResponseBody
	@RequestMapping(method=RequestMethod.GET,value="hello")
	public String Hello() {
		return "Hello world";
	}	

	@RequestMapping(method=RequestMethod.GET,value="welcome")
	public String welcome() {
		return "welcomepage";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="search")
	public String search() {
		return "searchpage";
	}
}
