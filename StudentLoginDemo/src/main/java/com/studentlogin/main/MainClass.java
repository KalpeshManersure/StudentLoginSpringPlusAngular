package com.studentlogin.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com")
public class MainClass {
	
	public static void main(String args[]){
		
		SpringApplication.run(MainClass.class, args);
		System.out.println("SpringBoot is Ready");
	}

}
