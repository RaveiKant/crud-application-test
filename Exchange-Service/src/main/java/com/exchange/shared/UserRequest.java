package com.exchange.shared;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserRequest {
	
	@JsonIgnore
	private String exchange_id;
	private String name;
	private String brief;
	private String address;
	private String remarks;
	
	
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRequest( String name, String brief, String address, String remarks) {
		super();
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	
}
