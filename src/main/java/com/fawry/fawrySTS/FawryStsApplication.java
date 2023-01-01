package com.fawry.fawrySTS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.fawry.fawrySTS.servise"})
public class FawryStsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FawryStsApplication.class, args);
	}

}
