package com.Pratap.Certification.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Pratap.Certification.Moduls.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization,Long> {

}
