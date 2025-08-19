package com.telecom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.telecom")
public class BillingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillingMicroserviceApplication.class, args);
	}

}
