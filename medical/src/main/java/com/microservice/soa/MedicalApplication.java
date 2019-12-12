package com.microservice.soa;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class MedicalApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedicalApplication.class, args);
	}
	@Bean
	ApplicationRunner init(MedicalRepository repository) {
		return args -> {
			Stream.of("Fiche1", "Fiche2").forEach(name -> {
				repository.save(new Medical(name));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
