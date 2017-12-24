package com.cskaoyan.service.impl;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cskaoyan.bean.User;
import com.cskaoyan.dao.UserDao;
import com.cskaoyan.service.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao ;
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findUserById(id);
	}

	
	@Transactional
	@Override
	public void register(User user) {
		
		dao.insertUser(user);
		int i=1/0;
		
		
	}

	@Transactional
	@Override
	public void deleteUserById(int uid) {
 		
		dao.deleteUserById(uid);
		//int i=1/0;
	}
	
	

}
