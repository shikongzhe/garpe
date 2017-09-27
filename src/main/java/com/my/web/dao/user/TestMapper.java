package com.my.web.dao.user;

import com.my.web.dto.Person;

public interface TestMapper {
	
	
	public int insertPerson(Person dto);
	/**
	 * 通过
	 * @Description:TODO
	 * @param userName
	 * @return
	 * Person
	 * @exception:
	 * @author: dpf
	 * @time:2017年9月26日 上午10:20:45
	 */
	public Person queryPersonByUserName(String userName);

}
