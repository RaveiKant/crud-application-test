package com.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.company.entity.Sector;

@Repository
public interface SectorDAO extends JpaRepository<Sector,Integer>{
	
	public Sector findByName(String name);

}
