package com.employeemgnt.dtos;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyDTO {
	
	@NotBlank(message="Blank is not Allowed")
	@NotNull(message="NUll Is Not Allowed")
	@Size(min=5,max=25,message="Name must be given in the range between 5-25")
	private String name;
	@NotBlank(message="Blank is not allowed")
	@NotNull(message="NUll Is Not Allowed")
	@Size(min=5,max=25,message="Location must be given in the range between 5-25 ")
	private String location;
		
	@Pattern(regexp="\\d{6}",message="Invalid pincode")
	private Long pincode;

}
