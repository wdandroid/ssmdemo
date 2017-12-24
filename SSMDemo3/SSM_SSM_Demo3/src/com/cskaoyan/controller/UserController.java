package com.cskaoyan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cskaoyan.bean.User;
import com.cskaoyan.service.UserService;



@RequestMapping("user")
@Controller
public class UserController {

	
	@Autowired
	UserService service;
	
	
	@RequestMapping("findUserById")
    public String	 queryUserInfoByUid(int uid,Model model){
    	
    	
    	User user = service.getUserById(uid);
    	
    	model.addAttribute("user", user);
    	
    	
    	return "/info.jsp";
    	
    };
    
    @RequestMapping("deleteUserById")
    public String deleteUserById(int uid){
    	try {
        	service.deleteUserById(uid);

		} catch (Exception e) {
	    	return "/error.jsp";
		}
    	
    	return "/success.jsp";
    	
    }
    
    
}
