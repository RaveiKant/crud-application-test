package com.sector.dto;

public class SectorRequest {
	
	private String name;
	private String brief;
	public SectorRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SectorRequest(String name, String brief) {
		super();
		this.name = name;
		this.brief = brief;
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
	
	

}
