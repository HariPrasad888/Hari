package com.employee;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  EmployeeApplication {

	private final static Logger log= LoggerFactory.getLogger(EmployeeApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}

}
