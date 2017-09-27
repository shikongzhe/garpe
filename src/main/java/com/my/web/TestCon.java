package com.my.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.web.service.test.Test;

@Controller
public class TestCon {
	
	@Autowired
	private Test test;

	/** 
	 * TODO 控制层代码 
	 * @author 591791 
	 * @date 2014年11月27日 
	 */  
	
	@ResponseBody    
    @RequestMapping("login") //用来处理前台的login请求  
    private  String hello( @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
		String name = test.getName();
		System.out.println(name);
		
        return "Hello "+username+",Your password is: "+password;  
          
    }  
	  


}
