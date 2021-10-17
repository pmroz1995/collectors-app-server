package com.example.dietApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DietApplication {

	public static void main(String[] args) {
		SpringApplication.run(DietApplication.class, args);
	}

}
