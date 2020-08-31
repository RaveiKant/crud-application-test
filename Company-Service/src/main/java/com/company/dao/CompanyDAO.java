package com.company.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company,Integer>  {

	public Company findByName(String name);

}
