package com.microservice.soa;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
@EnableEurekaClient
public class PatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}
	@Bean
	ApplicationRunner init(PatientRepository repository) {
		return args -> {
			Stream.of("ZINOX", "Drill", "StopAlgic").forEach(name -> {
				repository.save(new Patient(name));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
