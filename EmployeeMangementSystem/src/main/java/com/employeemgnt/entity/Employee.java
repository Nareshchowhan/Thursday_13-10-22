package com.employeemgnt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Employee {
	
      @Id
      @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
      @Column(name="EmployeeName",length=25)
	private String name;
      @Column(name="EmployeeAge")
	private Integer age;
      @Column(name="EmployeeEmail",length=25)
	private String emailId;
      @Column(name="EmpolyeeContact")
	private Long phoneNumber;
	
}
