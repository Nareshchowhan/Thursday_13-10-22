package com.employeemgnt.service;

import java.util.List;

import com.employeemgnt.dtos.EmployeeDTO;
import com.employeemgnt.entity.Employee;

public interface EmployeeService {
	
Employee saveEmployee(EmployeeDTO employeeDTO);    //saving employee details
	
	public List<Employee>displayAll();                 //displaying the list of all employee details
	
	Employee getEmployeeById(Integer employeeId);                      //getting the required employee details
	
	public String deleteEmployeeById(Integer EmployeeId);             //delete employee
	
	public String deleteAllEmployee();                        //delete all the employee
	
	public String updateEmployee(Integer employeeId, EmployeeDTO params);            //updating the employee details
	

}
