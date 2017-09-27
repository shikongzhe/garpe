package com.my.web.service.test.impl;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.web.common.ServiceResult;
import com.my.web.common.util.StringUtils;
import com.my.web.dao.user.TestMapper;
import com.my.web.dto.Person;
import com.my.web.service.test.Test;

@Service
public class TestImpl implements Test {

	@Autowired
	private TestMapper testMapper;
	public String getName() {
		// TODO Auto-generated method stub
		
		Person dto = new Person();
		UUID uuid = UUID.randomUUID();
		
		dto.setId(uuid.toString());
		dto.setPassWord("账号");
		dto.setUserName("密码");
		testMapper.insertPerson(dto);
		return "222222";
	}
	
	
	@Override
	public ServiceResult<String> registerUser(Person dto) {
		 ServiceResult<String> result = new  ServiceResult<String>();
		try {
			UUID uuid = UUID.randomUUID();
			dto.setId(uuid.toString());
			testMapper.insertPerson(dto);
			result.setStatus(true);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
			result.setStatus(false);

		}
		return result;
	}


	@SuppressWarnings("deprecation")
	@Override
	public ServiceResult<String> login(Person user,HttpServletRequest request) {
		ServiceResult<String> result = new ServiceResult<String>();
		try{
			
			HttpSession session = request.getSession();
			String rand =(String) session.getAttribute("rand");
			String autnNumer =  user.getAuthNumber();
			if(StringUtils.isNotEmpty(autnNumer)){
				autnNumer = autnNumer.toUpperCase();
			}
			
			
			if(!rand.equals(autnNumer)){
				result.setStatus(false);
				result.setMessages("验证码错误", false);
				return result;
			}

			Person queryUser = testMapper.queryPersonByUserName(user.getUserName());
			if(queryUser==null){
				result.setStatus(false);
				result.setMessages("没有此账号", false);
				return result;
			}
			
			if(user.getPassWord().equals(queryUser.getPassWord())){
				result.setStatus(true);
				result.setMessages("登陆成功", false);
				session.setAttribute("user", queryUser);
				session.setAttribute("userName", queryUser.getUserName());

			}else{
				result.setStatus(false);
				result.setMessages("密码错误", false);
			}
		}catch(Exception e){
			e.printStackTrace();
			result.setStatus(false);
		}
		return result;
	}

}
