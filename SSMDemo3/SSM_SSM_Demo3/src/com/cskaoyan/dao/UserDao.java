package com.cskaoyan.dao;

import com.cskaoyan.bean.User;

public interface UserDao {

	public User findUserById(int id);
	
	public void insertUser(User user);

	public void deleteUserById(int uid);
	
	
}
