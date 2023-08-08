package com.Pratap.Certification.Payloads;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Pratap.Certification.Moduls.Organization;
import com.Pratap.Certification.Moduls.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO {

private Long id;
	
	private String courseName;
	
	private String courseFee;
	
	private String courseTiming;
	
	private String instructorName;
	
	private Organization organization;
	
	
}
