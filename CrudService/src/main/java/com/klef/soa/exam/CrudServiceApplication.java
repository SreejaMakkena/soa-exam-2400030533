package com.klef.soa.exam;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudServiceApplication.class, args);
		System.out.println("Project is running...!!!");
	}

}
