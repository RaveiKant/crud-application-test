package com.company.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<NewCompanyRequest>  addCompany(@RequestBody NewCompanyRequest newCompanyRequest)
	{
		return new ResponseEntity<NewCompanyRequest>(companyService.addNewCompany(newCompanyRequest),HttpStatus.CREATED);
		
	}
	
	@GetMapping("list-all")
	public List<Company> listAll()
	{
		return companyService.listAll();
	}
	
	@DeleteMapping("delete/{name}")
	public Map<String,String> delete(@PathVariable("name") String name)
	{
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("status",companyService.deleteCompany(name));
	    return resultMap;
		
	}
	
}