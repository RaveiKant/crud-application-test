package com.company.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name="ipo")
public class IPO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="company_id")
	private Company company; 
	
	@Column(name="price_per_share")
	
	private float pricePerShare;
	@Column(name="total_shares")
	
	private Long totalShares;
	
	@Column(name="open_date")
	private Date openDate;
	
	@Column(name="open_time")
	private Time openTime;

	private String remark;

	public IPO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IPO(Company company, float pricePerShare, Long totalShares, Date openDate, Time openTime, String remark) {
		super();
		this.company = company;
		this.pricePerShare = pricePerShare;
		this.totalShares = totalShares;
		this.openDate = openDate;
		this.openTime = openTime;
		this.remark = remark;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
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

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Time getOpenTime() {
		return openTime;
	}

	public void setOpenTime(Time openTime) {
		this.openTime = openTime;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	

}
