package com.Pratap.Certification.Payloads;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class OrganizationDto {
	
	private Long id;
	
	private String organizationName;
	
	private String address;

}
