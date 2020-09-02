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

import com.company.dto.NewIPORequest;
import com.company.entity.IPO;
import com.company.service.IPOService;

@RestController
@RequestMapping("/api/ipo")
public class IpoController {
	
	@Autowired
	IPOService ipoService;
	
	@PostMapping("/add")
	public ResponseEntity<NewIPORequest> addIpo(@RequestBody NewIPORequest newIpo)
	{
		return new ResponseEntity<NewIPORequest>(ipoService.newIPO(newIpo),HttpStatus.CREATED);
	}
	
	@GetMapping("/list-all/{company_name}")
	public List<IPO> listAll(@PathVariable("company_name") String name)
	{
		return  ipoService.listAll(name);
	}
	
	@DeleteMapping("/delete/{id}")
	public Map<String,String> deleteIpo(@PathVariable("id") int id)
	{
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("status",ipoService.deleteIpo(id));
	    return resultMap;
		
	}

}
