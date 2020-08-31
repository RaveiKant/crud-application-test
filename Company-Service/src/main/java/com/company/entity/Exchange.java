package com.company.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Entity
@Table(name= "exchange")
public class Exchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id;
	
	@Column(name = "exchange_id",  nullable = false, unique = true)
	private String exchange_id;
	

	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "brief", nullable = false, columnDefinition = "TEXT")
	private String brief;
	
	@Column(name = "address", nullable = false, columnDefinition = "TEXT")
	private String address;
	
	@Column(name = "remarks")
	private String remarks;
	
	@JsonIgnore
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "exchanges")
	private List<Company> companies= new ArrayList<Company>();
	
	
	
	public Exchange() {
		super();
	}
	


	public Exchange(String exchange_id, String name, String brief, String address, String remarks,
			List<Company> companies) {
		super();
		this.exchange_id = exchange_id;
		this.name = name;
		this.brief = brief;
		this.address = address;
		this.remarks = remarks;
		this.companies = companies;
	}



	public String getExchangeId() {
		return exchange_id;
	}

	public void setExchangeId(String exchange_id) {
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

	public List<Company> getCompanies() {
		return companies;
	}
//
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	
	
	
	
}
