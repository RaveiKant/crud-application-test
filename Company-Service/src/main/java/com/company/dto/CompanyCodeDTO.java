package com.company.dto;

public class CompanyCodeDTO {
	private Long value;
	private String exchangeName;
	public CompanyCodeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompanyCodeDTO(Long value, String exchangeName) {
		super();
		this.value = value;
		this.exchangeName = exchangeName;
	}
	public void setValue(Long value) {
		this.value = value;
	}
	public String getExchangeName() {
		return exchangeName;
	}
	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}
	public Long getValue() {
		return value;
	}
	

}
