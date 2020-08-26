package com.user.dto;


public class UserSignupRequest {
	
	private String name;
	private String password;
	private String email;
	private Long mobile;
	public UserSignupRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserSignupRequest(String name, String password, String email, Long mobile) {
		super();
		this.name = name;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	
	
	

}
