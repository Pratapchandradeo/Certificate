 package com.Pratap.Certification.Moduls;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Organization {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String organizationName;
	
	private String address;
	
	@OneToMany(mappedBy = "organization")
	private List<User> users = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "organization")
	private List<Course> courses = new ArrayList<>();

}
