package com.company.service;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.CompanyDAO;
import com.company.dao.IPODAO;
import com.company.dto.NewIPORequest;
import com.company.entity.Company;
import com.company.entity.IPO;

@Service
public class IPOServiceImpl implements IPOService{
	
	@Autowired
	IPODAO ipoDao;
	
	@Autowired
	CompanyDAO companyDao;
	
	
	
	@Transactional
	public NewIPORequest newIPO(NewIPORequest newIpo) {
		Company company = companyDao.findByName(newIpo.getCompany());
		if(company!=null)
		{
			IPO ipo = new IPO(newIpo.getPricePerShare(),
					newIpo.getTotalShares(),
					newIpo.getOpenDate(),
					newIpo.getOpenTime(),
					newIpo.getRemark());
			ipo.setCompany(company);
			ipoDao.save(ipo);
			return newIpo;
		}
		return null;
	}


	@Override
	public String deleteIpo(int id) {
		
		Optional<IPO> ipo = ipoDao.findById(id);
		if(ipo.isPresent())
		{
			ipoDao.deleteById(id);
			return "IPO with date "+ipo.get().getOpenDate()+" deleted.";
		}
		return  "No ipo with ID : "+id+" found.";
	}

	@Override
	public List<IPO> listAll(String companyName) {
		
		return ipoDao.findAll();
	}
	


}
