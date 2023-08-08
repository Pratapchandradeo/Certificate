package com.Pratap.Certification.Controllers;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import com.Pratap.Certification.Exceptions.ResourceNotFoundException;
import com.Pratap.Certification.Payloads.Certificate;
import com.Pratap.Certification.Services.ServicesImpl.CertificateServiceImpl;



@RestController
@RequestMapping("/index.html")
@CrossOrigin("*")
public class CertificateController {
	
	@Autowired
	private CertificateServiceImpl certificateServiceImpl;
	
	
	@GetMapping("{id}")
	public ResponseEntity<Certificate> getDetailsForCertificate(
			@PathVariable("id") Long userId
			) throws ResourceNotFoundException{
		System.out.println("Accept");
		Certificate certificationData = this.certificateServiceImpl.getCertificationData(userId);
		
		return new ResponseEntity<>(certificationData, HttpStatus.OK);
	}
	
	

}
