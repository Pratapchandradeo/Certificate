package com.Pratap.Certification.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pratap.Certification.Moduls.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {

}
