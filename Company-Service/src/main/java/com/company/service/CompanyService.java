package com.company.service;

import java.util.List;

import com.company.dto.NewCompanyRequest;
import com.company.entity.Company;

public interface CompanyService {
	
	public NewCompanyRequest addNewCompany(NewCompanyRequest newCompanyRequest);
	public List<Company>listAll();
	public String deleteCompany(NewCompanyRequest newCompanyRequest);
	

}
