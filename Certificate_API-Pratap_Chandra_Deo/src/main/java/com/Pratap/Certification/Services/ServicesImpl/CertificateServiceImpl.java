package com.Pratap.Certification.Services.ServicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Pratap.Certification.Exceptions.ResourceNotFoundException;
import com.Pratap.Certification.Moduls.User;
import com.Pratap.Certification.Payloads.Certificate;
import com.Pratap.Certification.Repositorys.UserRepo;
import com.Pratap.Certification.Services.CertificateService;

@Service
public class CertificateServiceImpl implements CertificateService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public Certificate getCertificationData(Long user_id) {
		
				User user = this.userRepo.findById(user_id).orElseThrow(() -> new ResourceNotFoundException("User", "id", user_id));
				
				Certificate data = new Certificate(user.getUserName(), user.getOrganization().getOrganizationName(), user.getCourse().getCourseName());
				
				System.out.println(data.toString());
				
				
		return data;
	}

}
