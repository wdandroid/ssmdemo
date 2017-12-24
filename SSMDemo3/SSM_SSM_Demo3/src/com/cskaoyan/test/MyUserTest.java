package com.cskaoyan.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;
import com.sun.mail.imap.protocol.UID;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MyUserTest {


	@Autowired
	UserService service;
	
	
	@Test
	 public void testGetUserById(){
		 
		 User userById = service.getUserById(1);
		 System.out.println("MyUserTest.testGetUserById()"+userById);
	 }
	
	
	@Test
	 public void testRegister(){
		
		 User user = new User();
		 
		 user.setUsername("ccc");
		 user.setPassword("ddd");
		 user.setNickname("fff");
		 
		 service.register(user);
 	 }
	
	
	@Test
	 public void testdetete(){
		
		 service.deleteUserById(12);
	 }
	
}
