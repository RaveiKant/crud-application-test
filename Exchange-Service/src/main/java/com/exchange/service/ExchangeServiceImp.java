package com.exchange.service;


import java.util.List;
import java.util.UUID;
import java.lang.reflect.Type;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.exchange.dao.ExchangeDAO;
import com.exchange.entity.Exchange;
import com.exchange.shared.UserRequest;
import com.exchange.shared.UserResponse;

@Service
public class ExchangeServiceImp implements ExchangeService{
	
	@Autowired
	private ExchangeDAO exchangeDao;

	public ExchangeServiceImp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ExchangeServiceImp(ExchangeDAO exchangeDao) {
		super();
		this.exchangeDao = exchangeDao;
		
	}

	@Override
//	@Transactional
	public UserResponse addExchange(UserRequest userRequest) {
		if(exchangeDao.findByName(userRequest.getName())==null)
		{
			String st = UUID.randomUUID().toString();
			String str[] = st.split("-");
			userRequest.setExchange_id(str[0]);
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
			Exchange exchange = exchangeDao.save(mapper.map(userRequest,Exchange.class));
			return mapper.map(exchange,UserResponse.class);
		}
		return null;
	}

	@Override
//	@Transactional
	public UserResponse getCompanies(String name) {
		Exchange exchange = exchangeDao.findByName(name);
		if(exchange!= null)
		{
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
			return mapper.map(exchange, UserResponse.class);
		}
		return null;
	}

	@Override
//	@Transactional
	public List<UserResponse> getAllExchange() {
		Type listType = new TypeToken<List<UserResponse>>(){}.getType();
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		return mapper.map(exchangeDao.findAll(),listType); 
	}

}
