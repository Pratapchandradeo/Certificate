package com.Pratap.Certification.Moduls;


import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String courseName;
	
	private String courseFee;
	
	private String courseTiming;
	
	private String instructorName;
	
	@ManyToOne
	@JoinColumn(name ="organization_id")
	private Organization organization;

	@OneToMany(mappedBy = "course")
	private List<User> user;
}
