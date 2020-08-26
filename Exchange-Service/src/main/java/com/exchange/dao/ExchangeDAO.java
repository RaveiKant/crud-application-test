package com.exchange.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.exchange.entity.Exchange;



public interface ExchangeDAO extends JpaRepository<Exchange,Integer> {
	
	public Exchange findByName(String name);

}
