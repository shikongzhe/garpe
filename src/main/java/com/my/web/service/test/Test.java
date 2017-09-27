package com.my.web.service.test;

import javax.servlet.http.HttpServletRequest;

import com.my.web.common.ServiceResult;
import com.my.web.dto.Person;

public interface Test {
	
	public String getName();
	
	public ServiceResult<String> registerUser(Person user);
	
	/**
	 * 登陆
	 * @Description:TODO
	 * @param user
	 * @return
	 * ServiceResult<String>
	 * @exception:
	 * @author: dpf
	 * @time:2017年9月26日 上午10:16:47
	 */
	public ServiceResult<String> login(Person user,HttpServletRequest request);
}
