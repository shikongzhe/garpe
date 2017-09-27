package com.my.web.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/main")
public class TestView {
	
    @RequestMapping(value="/login")  
	public ModelAndView getLoginView(){
		
    	ModelAndView mv = new ModelAndView("login");
		return mv;
	}
    
    
    
    @RequestMapping(value="/registerUser.view")  
   	public ModelAndView registerUserView(){
   		
       	ModelAndView mv = new ModelAndView("/web/user/registerUser");
   		return mv;
   	}
   	


}
