package com.sector.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sector.dto.CompaniesInSectorResponse;
import com.sector.dto.SectorRequest;
import com.sector.service.SectorService;

@RestController
@RequestMapping("/api")
public class SectorController {
	
	@Autowired
	private SectorService sectorService;
	
	@PostMapping("/add")
	public Map<String,String> newSector(@RequestBody SectorRequest sectorRequest)
	{
		Map<String, String> resultMap = new HashMap<>();
		if(sectorService.addSector(sectorRequest))
			resultMap.put("status","new sector created successfully!");
		else
			resultMap.put("status","sector already exists");
		return resultMap;
					
	}
	
	@GetMapping("/all-sectors")
	public ResponseEntity<List<SectorRequest>> listSectors()
	{
		return new ResponseEntity<List<SectorRequest>>(sectorService.allSectors(),HttpStatus.OK);
	}
	
	@GetMapping("/find-company/{name}")
	public ResponseEntity<CompaniesInSectorResponse> listCompanies(@PathVariable("name") String name)
	{
		return new ResponseEntity<CompaniesInSectorResponse>(sectorService.listCompanies(name),HttpStatus.FOUND);
		
	}

}
