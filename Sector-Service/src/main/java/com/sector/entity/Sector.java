package com.sector.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "sector")
public class Sector {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name",nullable=false)
	private String name;
	
	@Column(name = "brief",nullable=false,columnDefinition = "TEXT")
    private String brief;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "sector")
	private List<Company> companies= new ArrayList<Company>();

	public Sector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sector(String name, String brief) {
		super();
		this.name = name;
		this.brief = brief;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}
	
	
	
	
}
