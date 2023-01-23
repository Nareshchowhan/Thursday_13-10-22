package com.employeemgnt.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemgnt.dtos.CompanyDTO;
import com.employeemgnt.entity.Company;
import com.employeemgnt.repositories.CompanyRepository;
import com.employeemgnt.service.CompanyService;

@Service
public class CompanyServiceImpl  implements CompanyService{
	Company company;
	@Autowired
	CompanyRepository companyRepository;

	@Override
	public Company saveCompany(CompanyDTO companyDTO) {
		   CompanyRepository companyRepository;
		
		Company company=Company.builder()
				.name(companyDTO.getName())
				.location(companyDTO.getLocation())
				.pincode(companyDTO.getPincode())
				.build();
		return companyRepository.save(company);
	}

	@Override
	public String updateCompany(CompanyDTO params, Integer companyId) {
		company=companyRepository.findById(companyId).get();
		company.setName(params.getName());
		company.setLocation(params.getLocation());
		company.setPincode(params.getPincode());
		companyRepository.save(company);
		return "company record is updated successfully";
	}

	@Override
	public Company getCompanyById(Integer employeeId) {
		return companyRepository.findById(companyId).get();
	}

	@Override
	public String deleteCompanyById(Integer companyId) {
		companyRepository.deleteById(companyId);
		return "The company deleted by id is"+ companyId;
	}

}
