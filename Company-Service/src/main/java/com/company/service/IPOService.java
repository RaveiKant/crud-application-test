package com.company.service;

import java.util.List;

import com.company.dto.NewIPORequest;
import com.company.entity.IPO;

public interface IPOService {
	public NewIPORequest newIPO(NewIPORequest newIpoRequest);
	public String deleteIpo(int id);
	public List<IPO> listAll(String companyName);

}
