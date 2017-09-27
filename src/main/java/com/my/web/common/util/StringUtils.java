package com.my.web.common.util;

public class StringUtils {
	
	
	
	public static Boolean isEmpty(String str){
		if(str==null){
			return true;
		}
		if(str.equals("")){
			return true;
		}
		return false;
	}
	
	
	public static Boolean isNotEmpty(String str){
		if(str==null){
			return false;
		}
		if(str.equals("")){
			return false;
		}
		return true;
	}


}
