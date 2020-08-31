package com.exchange.service;

import java.util.List;

import com.exchange.shared.UserRequest;
import com.exchange.shared.UserResponse;

public interface ExchangeService {
	
	public UserResponse addExchange(UserRequest newC);
	public UserResponse getCompanies(String name);
	public List<UserResponse> getAllExchange();
}
