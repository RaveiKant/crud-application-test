package com.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.CompanyCode;

public interface CompanyCodeDAO extends JpaRepository<CompanyCode,Integer> {

}
