package com.capstore.repo;

import java.util.List;

import com.capstore.bean.LoginBean;

public interface ILoginRepo{
 
	public LoginBean save(LoginBean bean);
	public List<LoginBean> findAll();
	
}
