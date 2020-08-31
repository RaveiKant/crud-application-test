package com.company.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.CompanyCodeDAO;
import com.company.dao.CompanyDAO;
import com.company.dao.ExchangeDAO;
import com.company.dao.SectorDAO;
import com.company.dto.CompanyCodeDTO;
import com.company.dto.NewCompanyRequest;
import com.company.entity.Company;
import com.company.entity.CompanyCode;
import com.company.entity.Exchange;
import com.company.entity.Sector;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDAO companyDao;
	@Autowired
	private ExchangeDAO exchangeDao;
	@Autowired
	private SectorDAO sectorDao;
	@Autowired
	private CompanyCodeDAO companyCodeDao;
	
	@Transactional
	public NewCompanyRequest addNewCompany(NewCompanyRequest newC) {
		if(companyDao.findByName(newC.getName())==null)
		{
			Company company = new Company(UUID.randomUUID().toString(),
			newC.getName(),
			newC.getTurnover(),
			newC.getCeo(),
			newC.getDirectors(), 
			newC.getBrief()); 
			Sector sector = sectorDao.findByName(newC.getSector());
			company.setSector(sector);
			List<CompanyCode> companyCodeList = new ArrayList<CompanyCode>();
			for(CompanyCodeDTO i:newC.getCompanyCodeDto())
				{
						CompanyCode companyCode = 
						new CompanyCode(i.getValue(),
						i.getExchangeName());
						companyCodeList.add(companyCode);
						Exchange exchange = exchangeDao.findByName(i.getExchangeName());
						company.getExchanges().add(exchange);
				}
			Company savedCompany = companyDao.save(company);
			for(CompanyCode i : companyCodeList)
				{
					i.setCompany(savedCompany);
					companyCodeDao.save(i);
				}
			return newC;
		}
		else
			return null;

	}
	@Override
	public List<Company> listAll() {
		return companyDao.findAll();
	}

	@Override
	public String deleteCompany(String name) {
		Company company = companyDao.findByName(name);
		if(company!=null) {
			companyDao.delete(company);
			return "Company with name "+name+"deleted successfully";
		}
		return "Company with name "+name+" not found";
	}

}
