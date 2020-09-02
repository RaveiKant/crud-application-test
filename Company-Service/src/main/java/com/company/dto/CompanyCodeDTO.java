package com.company.dto;

public class CompanyCodeDTO {
	private String value;
	private String exchangeName;
	public CompanyCodeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyCodeDTO(String value, String exchangeName) {
		super();
		this.value = value;
		this.exchangeName = exchangeName;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	public String getValue() {
		return value;
	}
	

}
