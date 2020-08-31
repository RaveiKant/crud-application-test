package com.company.dto;

import java.util.ArrayList;
import java.util.List;

public class NewCompanyRequest {
	
	private String name;
	private float turnover;
	private String ceo;
	private String directors;
	private String brief;
	private List<CompanyCodeDTO> companyCodeDto = new ArrayList<CompanyCodeDTO>();
	private String sector;
	public NewCompanyRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewCompanyRequest(String name, float turnover, String ceo, String directors, String brief,
			List<CompanyCodeDTO> companyCodeDto, String sector) {
		super();
		this.name = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.directors = directors;
		this.brief = brief;
		this.companyCodeDto = companyCodeDto;
		this.sector = sector;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTurnover() {
		return turnover;
	}
	public void setTurnover(float turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getDirectors() {
		return directors;
	}
	public void setDirectors(String directors) {
		this.directors = directors;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public List<CompanyCodeDTO> getCompanyCodeDto() {
		return companyCodeDto;
	}
	public void setCompanyCodeDto(List<CompanyCodeDTO> companyCodeDto) {
		this.companyCodeDto = companyCodeDto;
	}
	
	
	

}
