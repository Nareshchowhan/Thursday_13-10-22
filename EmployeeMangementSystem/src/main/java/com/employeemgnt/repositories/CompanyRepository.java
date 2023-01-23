package com.employeemgnt.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemgnt.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
