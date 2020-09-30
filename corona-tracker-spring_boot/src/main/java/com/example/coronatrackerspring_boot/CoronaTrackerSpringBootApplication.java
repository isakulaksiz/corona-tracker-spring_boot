package com.example.coronatrackerspring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronaTrackerSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronaTrackerSpringBootApplication.class, args);
	}

}
