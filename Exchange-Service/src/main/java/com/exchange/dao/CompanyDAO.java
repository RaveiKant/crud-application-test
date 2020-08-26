package com.exchange.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exchange.entity.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company,Integer>{

}
