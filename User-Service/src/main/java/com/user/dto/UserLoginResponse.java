package com.user.dto;

import javax.persistence.Column;

public class UserLoginResponse {
	
	private String name;
	private String type;
	private String email;
	private Long mobile;
	private Boolean confirmed;
	
	public UserLoginResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserLoginResponse(String name, String type, String email, Long mobile, Boolean confirmed) {
		super();
		this.name = name;
		this.type = type;
		this.email = email;
		this.mobile = mobile;
		this.confirmed = confirmed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Boolean getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(Boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	
}
