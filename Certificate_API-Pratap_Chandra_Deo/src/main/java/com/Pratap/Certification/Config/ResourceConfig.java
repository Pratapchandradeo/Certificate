package com.Pratap.Certification.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {
	
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		String path ="file:///G:/Internship/Certificate_API-Pratap_Chandra_Deo/src/main/resources/static/";
		
		registry.addResourceHandler("/**").addResourceLocations(path);
	}

}
