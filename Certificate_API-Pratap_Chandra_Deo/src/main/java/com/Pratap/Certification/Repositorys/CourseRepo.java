package com.Pratap.Certification.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pratap.Certification.Moduls.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

}
