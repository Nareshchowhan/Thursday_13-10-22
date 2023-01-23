package com.employeemgnt.service;

import com.employeemgnt.dtos.CompanyDTO;
import com.employeemgnt.entity.Company;

public interface CompanyService {
Company saveCompany(CompanyDTO companyDTO);   //save company details
	
    public String updateCompany(CompanyDTO params,Integer companyId);  //update company details
    
	Company getCompanyById(Integer employeeId);   //get company details
	
	public String deleteCompanyById(Integer companyId);  //delete company

}
