package com.employeemgnt.controllers;

import java.util.List;

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

import com.employeemgnt.dtos.EmployeeDTO;
import com.employeemgnt.entity.Employee;
import com.employeemgnt.exception.EmployeeNotFoundException;
import com.employeemgnt.serviceimpl.EmployeeServiceImpl;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	//For posting Employee details
	
		@PostMapping(path="/employee")
		public ResponseEntity<Employee> addEmployee(@RequestBody @Valid  EmployeeDTO employeeDTO){
			try
			{
				Employee employee = employeeServiceImpl.saveEmployee(employeeDTO);
				 if(employee!=null) {
						return new ResponseEntity<Employee>(employee,HttpStatus.CREATED);
					}
			}
			catch(Exception ex)
			{
				throw new EmployeeNotFoundException("Unable to handle Employee Request");
			}
			return new ResponseEntity<Employee>(HttpStatus.BAD_REQUEST);
		}
		
		//getting Employee details by Its id
		
		@GetMapping(path="/employee/{employeeId}")
		public ResponseEntity<Employee> getEmployeeById(@PathVariable("employeeId") Integer employeeId)
		{
			try {
				Employee employee = employeeServiceImpl.getEmployeeById(employeeId);
				if(employee!=null) {
					return new ResponseEntity<Employee>(employee,HttpStatus.FOUND);
				}
			}
			catch(Exception e)
			{
				throw new EmployeeNotFoundException("No Such Employee with id " + employeeId + " Found");
			}
			 return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
			
		}
		
		//Getting all employee details
		
		@GetMapping(path="/allemployee")
		public ResponseEntity<List<Employee>> getAllEmployee()
		{
			try
			{
			 List<Employee> employeeList=employeeServiceImpl.displayAll();
			 if(employeeList!=null)
				return new ResponseEntity<List<Employee>>(employeeList,HttpStatus.FOUND);
			}
			catch(Exception e)
			{
				throw new EmployeeNotFoundException("No Such hospital Exist");
			}
			return new ResponseEntity<List<Employee>>(HttpStatus.NOT_FOUND);
		}
		
		//updating employee details based on id
		
		@PutMapping(path="/updateEmployee/{employeeId}")
		public ResponseEntity<String> updateEmployee(@PathVariable("employeeId") Integer employeeId, @RequestBody @Valid EmployeeDTO employeeDTO)
		{
			try
			{
			 String employee=employeeServiceImpl.updateEmployee(employeeId, employeeDTO);
			 if(employee!=null)
				return new ResponseEntity<String>(employee,HttpStatus.ACCEPTED);
			}
			catch(Exception e)
			{
				throw new EmployeeNotFoundException("Unable to update Employee details");
			}
			return new ResponseEntity<String>(HttpStatus.NOT_MODIFIED);		
		}
		
		
		//Deleting employee details by its Id
		@DeleteMapping(path="/deleteEmployeeById/{employeeId}")
		public ResponseEntity<String> deleteEmployee(@PathVariable("employeeId") Integer employeeId)
		{
			try 
			{
			 String employee=employeeServiceImpl.deleteEmployeeById(employeeId);
			 if(employee!=null)
				return new ResponseEntity<String>(employee,HttpStatus.ACCEPTED);
			}
			catch(Exception e)
			{
				throw new EmployeeNotFoundException("Unable to delete employee details");
			}
			return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
		}
		
		//Deleting all employee details
			@DeleteMapping(path="/deleteAllEmployeedetails")
			public ResponseEntity<String> deleteAllEmployee()
			{
				try
				{
				 String employee=employeeServiceImpl.deleteAllEmployee();
				 if(employee!=null)
					return new ResponseEntity<String>(employee,HttpStatus.ACCEPTED);
				}
				catch(Exception e)
				{
					throw new EmployeeNotFoundException("Unable to delete employee details");
				}
				return new ResponseEntity<String>(HttpStatus.NOT_ACCEPTABLE);		
			}	
		
		//End Of code

}