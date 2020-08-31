package com.company.dto;

import java.util.List;

import com.company.entity.CompanyCode;
import com.company.entity.Sector;

public class NewCompanyResponse {
	
	private String name;
	private float turnover;
	private String ceo;
	private String directors;
	private String brief;
	private List<CompanyCode> companyCode;
	private Sector sector;

}
