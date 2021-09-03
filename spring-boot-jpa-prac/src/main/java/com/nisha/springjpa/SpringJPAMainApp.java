package com.nisha.springjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJPAMainApp implements CommandLineRunner {

	private static Logger logger = LoggerFactory.getLogger(SpringJPAMainApp.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringJPAMainApp.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("in run");
	}

}
