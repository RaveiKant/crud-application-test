package com.exchange.shared;

import java.util.ArrayList;
import java.util.List;

import com.exchange.entity.Company;

public class UserResponse {
	
	private String exchange_id;
	private String name;
	private String brief;
	private String address;
	private List<Company> companies= new ArrayList<Company>();
	
	
	
	public UserResponse(String exchange_id, String name, String brief, String address,
			List<Company> companies) {
		super();
		this.exchange_id = exchange_id;
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.companies = companies;
	}
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getExchange_id() {
		return exchange_id;
	}
	public void setExchange_id(String exchange_id) {
		this.exchange_id = exchange_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	
	

}
