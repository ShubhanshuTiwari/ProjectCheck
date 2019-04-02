package com.capgemini.CapstoreBack.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Hello")
public class HelloBean {

	String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public HelloBean() {
	}

	public HelloBean(String msg) {
		this.msg = msg;
	}
	
	
	
}
