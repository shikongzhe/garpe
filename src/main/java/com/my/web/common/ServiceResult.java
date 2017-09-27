package com.my.web.common;


public class ServiceResult<T> {
	// 返回结果的状态
	private boolean status;

	// 返回对象
	private T data;
	
	private String messages;
	

	/**
	 * @param status
	 * @param data
	 */
	public ServiceResult( T data) {
		this.status = true;
		this.data = data;
		this.messages="";
	}

	/**
	 * @param status
	 * @param data
	 */
	public ServiceResult(boolean status,T data,String key) {
		this.status = status;
		if(status){
			this.data=data;
		}else{
			this.data=data;
			//this.messages=new Message().getMessage(key);
		}
	}
	
	

	public ServiceResult(boolean status, String msgKey) {
		this.status = status;
		//this.messages=new Message().getMessage(msgKey);
	}

	public ServiceResult() {
	}

	/**
	 * @param status
	 * @param data
	 */


	public boolean isStatus() {
		return status;
	}



	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
		this.status=true;
	}

	public String getMessages() {
		return messages;
	}


	public void setMessages(String messages,boolean flag) {
		this.messages=messages;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}



}
