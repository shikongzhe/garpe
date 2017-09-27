package com.my.web.controller.login.data;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.registry.infomodel.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.my.web.common.ServiceResult;
import com.my.web.dto.Person;
import com.my.web.service.test.Test;

@Controller
@RequestMapping("/login")
public class LoginManageController {
	
	@Autowired
	private Test test;
	
	@ResponseBody
    @RequestMapping(value="/registerUser.do")  
	public ServiceResult<String>  registerUser(Person person){
		ServiceResult<String> result = test.registerUser(person);
		return result;
	}
	
	
	@ResponseBody
    @RequestMapping(value="/login.do")  
	public ServiceResult<String>  login(Person person,HttpServletRequest request){
		ServiceResult<String> result = test.login(person,request);


		return result;
	}
	
	

}
