package com.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Exchange;

@Repository
public interface ExchangeDAO extends JpaRepository<Exchange,Integer>{
	
	public Exchange findByName(String name);


}
