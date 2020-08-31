package com.sector.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sector.entity.Company;



@Repository
public interface CompanyDAO extends JpaRepository<Company,Integer>{

}
