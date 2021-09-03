package com.nisha.restAPIMain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestAPIMainApp {
	
	private Logger logger=LoggerFactory.getLogger(RestAPIMainApp.class);
	
	public static void main(String[] args) {
		SpringApplication.run(RestAPIMainApp.class, args);
	}
	
	
	
	

}
