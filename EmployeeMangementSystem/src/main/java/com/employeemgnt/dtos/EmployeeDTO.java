package com.employeemgnt.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
	@NotBlank(message="Emptiness is not allowed")
	@NotNull(message="Null is not allowed")
	@Size(min=4,max=20,message="Name must be in the range 4-20 characters")
	private String name;
	
	@Min(value=21,message="Invalid age")
	@Max(value=30,message="Invalid age")
	private Integer age;
	
	@Email(message="Invalid Email format")
	private String emailId;
	
	@Pattern(regexp="\\d{10}",message="Invalid MobileNumber")
	private String mobileNo;
	
}