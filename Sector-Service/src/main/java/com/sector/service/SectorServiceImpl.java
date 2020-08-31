package com.sector.service;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sector.dao.SectorDAO;
import com.sector.dto.CompaniesInSectorResponse;
import com.sector.dto.SectorRequest;
import com.sector.entity.Sector;

@Service
public class SectorServiceImpl implements SectorService
{
	@Autowired
	private SectorDAO sectorDao;

	@Override
	public boolean addSector(SectorRequest sectorRequest)
	{
		if(sectorDao.findByName(sectorRequest.getName())==null)
		{
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy((MatchingStrategies.STRICT));
			sectorDao.save(mapper.map(sectorRequest, Sector.class));
			return true;
		}
		return false;
	}

	@Override
	public List<SectorRequest> allSectors() {		
			Type listType = new TypeToken<List<SectorRequest>>(){}.getType();
			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
			return mapper.map(sectorDao.findAll(),listType); 
	}

	@Override
	public CompaniesInSectorResponse listCompanies(String name) {
		Sector sector = sectorDao.findByName(name);
		if(sector!=null) 
		{

			ModelMapper mapper = new ModelMapper();
			mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
			return mapper.map(sector, CompaniesInSectorResponse.class);
		}
		return null;
	}
}
