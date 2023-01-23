package com.employeemgnt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employeemgnt.dtos.CompanyDTO;
import com.employeemgnt.entity.Company;
import com.employeemgnt.exception.CompanyNotFoundException;
import com.employeemgnt.serviceimpl.CompanyServiceImpl;

import jakarta.validation.Valid;

@RestController
public class CompanyController {
@Autowired
CompanyServiceImpl companyServiceImpl;

//For posting company details

	@PostMapping(path="/company")
	public ResponseEntity<Company> addCompany(@RequestBody @Valid  CompanyDTO companyDTO){
		try
		{
			Company company =companyServiceImpl.saveCompany(companyDTO);
			 if(company!=null) {
					return new ResponseEntity<Company>(company,HttpStatus.CREATED);
				}
		}
		catch(Exception ex)
		{
			throw new CompanyNotFoundException("Unable to handle Company Request");
		}
		return new ResponseEntity<Company>(HttpStatus.BAD_REQUEST);
	}
	
	//getting company details through its Id
	
	@GetMapping(path="/getCompanyById/{companyId}")
	public ResponseEntity<Company> getCompanyDetailsById(@PathVariable("companyId") Integer companyId)
	{
		try {
			Company company = companyServiceImpl.getCompanyById(companyId);
			if(company!=null) {
				return new ResponseEntity<Company>(company,HttpStatus.FOUND);
			}
		}
		catch(Exception e)
		{
			throw new CompanyNotFoundException("No Such company with id " + companyId + "Found");
		}
		 return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
		
	}
	
	
	//updating company details by its Id
	
	@PutMapping(path="/updateCompanyById/{companyId}")
	public ResponseEntity<String> updateCompany(@PathVariable("companyId") Integer companyId, @RequestBody @Valid CompanyDTO companyDTO)
	{
		try
		{
		 String company=companyServiceImpl.updateCompany(companyDTO, companyId);
		 if(company!=null)
			return new ResponseEntity<String>(company,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new CompanyNotFoundException("Unable to update company details");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);		
	}
	
	//deleting Company By its Id
	
	@DeleteMapping(path="/deleteCompanyById/{companyId}")
	public ResponseEntity<String> deleteCompanyRecord(@PathVariable("companyId") Integer CompanyId)
	{
		try 
		{
		 String company=companyServiceImpl.deleteCompanyById(CompanyId);
		 if(company!=null)
			return new ResponseEntity<String>(company,HttpStatus.ACCEPTED);
		}
		catch(Exception e)
		{
			throw new CompanyNotFoundException("Unable to delete company");
		}
		return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
	}
	
	//End Of code

}
