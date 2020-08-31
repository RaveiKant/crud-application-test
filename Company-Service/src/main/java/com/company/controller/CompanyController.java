package com.company.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.NewCompanyRequest;
import com.company.entity.Company;
import com.company.service.CompanyService;


@RestController
@RequestMapping("/api")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/add")
	public ResponseEntity<NewCompanyRequest>  addCompany(NewCompanyRequest newCompanyRequest)
	{
		return new ResponseEntity<NewCompanyRequest>(companyService.addNewCompany(newCompanyRequest),HttpStatus.CREATED);
		
	}
	
	@GetMapping("list-all")
	public List<Company> listAll()
	{
		return companyService.listAll();
	}
	
	
}