package com.company.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.company.entity.Company;

@Repository
public interface CompanyDAO extends JpaRepository<Company,Integer>  {

	public Company findByName(String name);
	@Query(value="select * from company u where u.name like %:keyword%", nativeQuery=true)
	public List<Company> findCompanyByKeyword(@Param("keyword")String keyword);

}
