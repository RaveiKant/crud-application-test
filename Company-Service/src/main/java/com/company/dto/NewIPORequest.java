package com.company.dto;

import java.sql.Date;
import java.sql.Time;


import com.company.entity.Company;


public class NewIPORequest {
	
	
	private String company; 
	
	private float pricePerShare;
	
	private Long totalShares;
	
	private String openDate;
	
	private String openTime;

	private String remark;

	public NewIPORequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NewIPORequest(float pricePerShare, Long totalShares, String openDate, String openTime, String remark) {
		super();
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.openDate = openDate;
		this.openTime = openTime;
		this.remark = remark;
	}


	public void setCompany(String company) {
		this.company = company;
	}

	public float getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(float pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public Long getTotalShares() {
		return totalShares;
	}

	public void setTotalShares(Long totalShares) {
		this.totalShares = totalShares;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getCompany() {
		return company;
	}
	
	


}
