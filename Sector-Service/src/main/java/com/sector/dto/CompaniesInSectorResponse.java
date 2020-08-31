package com.sector.dto;

import java.util.ArrayList;
import java.util.List;

import com.sector.entity.Company;

public class CompaniesInSectorResponse {
	
	private String name;
	private String brief;
	private List<Company> companies;
	public CompaniesInSectorResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CompaniesInSectorResponse(String name, String brief, List<Company> companies) {
		super();
		this.name = name;
		this.brief = brief;
		this.companies = companies;
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
	public List<Company> getCompanies() {
		return companies;
	}
	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	
	
	
}
