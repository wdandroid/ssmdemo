package com.cskaoyan.service;

import com.cskaoyan.bean.User;

public interface UserService {

  User 	getUserById(int id);
  
  
  void register(User user);


void deleteUserById(int uid);
  
}
