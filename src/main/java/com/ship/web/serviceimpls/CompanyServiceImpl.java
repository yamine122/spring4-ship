package com.ship.web.serviceimpls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.web.domains.CompanyDTO;
import com.ship.web.mappers.CompanyMapper;
import com.ship.web.services.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired CompanyMapper CompanyMapper;
	
	@Override
	public boolean join(CompanyDTO param) {
		System.out.println("서비스조인!"+param.toString());
		return false;
	}

	@Override
	public CompanyDTO login(CompanyDTO param) {
		
		return null;
	}

	@Override
	public List<CompanyDTO> search(CompanyDTO param) {
		
		return null;

	
}
}
