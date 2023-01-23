package com.employeemgnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgnt.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
