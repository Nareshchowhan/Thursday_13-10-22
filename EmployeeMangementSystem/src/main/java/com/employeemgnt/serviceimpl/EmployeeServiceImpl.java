package com.employeemgnt.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeemgnt.dtos.EmployeeDTO;
import com.employeemgnt.entity.Employee;
import com.employeemgnt.repositories.EmployeeRepository;
import com.employeemgnt.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
       Employee employee;
       @Autowired
       EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(EmployeeDTO employeeDTO) {
		Employee employee=Employee.builder()
				.name(employeeDTO.getName())
				.emailId(employeeDTO.getEmailId())
				.age(employeeDTO.getAge()).
				build();
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> displayAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		return employeeRepository.findById(employeeId).get();
	}

	@Override
	public String deleteEmployeeById(Integer EmployeeId) {
		employeeRepository.deleteById(employeeId); 
		 return "The Employee deleted by Id is:"+employeeId;
	}

	@Override
	public String deleteAllEmployee() {
		employeeRepository.deleteAll();
		return "All employee records are deleted successfully";
	}

	@Override
	public String updateEmployee(Integer employeeId, EmployeeDTO params) {
		employee=employeeRepository.findById(employeeId).get();
		employee.setName(params.getName());
		employee.setAge(params.getAge());
		employee.setEmailId(params.getEmailId());
		employeeRepository.save(employee);
		return "Employee record updated successfully";
	}

}
