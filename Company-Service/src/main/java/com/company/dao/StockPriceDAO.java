package com.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.StockPrice;

public interface StockPriceDAO extends JpaRepository<StockPrice,Integer>{

}
