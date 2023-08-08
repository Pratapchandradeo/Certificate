package com.Pratap.Certification.Payloads;

import com.Pratap.Certification.Moduls.Course;
import com.Pratap.Certification.Moduls.Organization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	
private Long id;
	
	private String userName;
	
	private String email;
	
	private String contactNumber;
	
	private String password;
	private Organization organization;
	private Course course;

}
