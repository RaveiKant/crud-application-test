package com.exchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exchange.service.ExchangeService;
import com.exchange.shared.UserRequest;
import com.exchange.shared.UserResponse;

@RestController
@RequestMapping("/api")
public class ExchangeController {
	
	@Autowired
	private ExchangeService exchangeService;

//	public ExchangeController(ExchangeService exchangeService) {
//		super();
//		this.exchangeService = exchangeService;
//	}
//	
	@PostMapping("/add")
	public ResponseEntity<UserResponse> addExchange(@RequestBody UserRequest userRequest)
	{
		return new ResponseEntity<UserResponse>(exchangeService.addExchange(userRequest),HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value ="/{name}")
	public ResponseEntity<UserResponse>  getExchange(@PathVariable String name)
	{
		return new ResponseEntity<UserResponse>(exchangeService.getCompanies(name),HttpStatus.FOUND);
		
	}
	
	@GetMapping("/all-exchanges")
	public ResponseEntity<List<UserResponse>> allExchanges()
	{
		return new ResponseEntity<List<UserResponse>>(exchangeService.getAllExchange(),HttpStatus.FOUND);
		
	}
}
