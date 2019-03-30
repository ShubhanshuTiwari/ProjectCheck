package com.capstore.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capstore.bean.LoginBean;


@Repository
@Transactional
public class LoginRepo implements ILoginRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional
	public LoginBean save(LoginBean bean) {
		// TODO Auto-generated method stub
		 entityManager.persist(bean);				// for inserting the value
		 return bean;
	}

	@Override
	@Transactional
	public List<LoginBean> findAll() {
		// TODO Auto-generated method stub
		
		System.out.println("Repo");
		TypedQuery<LoginBean> query=entityManager.createQuery("select loginb from LoginBean loginb ", LoginBean.class);  // for retrieving the data from table
						
					List<LoginBean> list= query.getResultList();
				return list;
	}

	
	

}
