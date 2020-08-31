package com.sector.service;

import java.util.List;


import com.sector.dto.CompaniesInSectorResponse;
import com.sector.dto.SectorRequest;




public interface SectorService {
	
	public boolean addSector(SectorRequest sectorRequest);
	public List<SectorRequest> allSectors();
	public CompaniesInSectorResponse listCompanies(String name);

}
