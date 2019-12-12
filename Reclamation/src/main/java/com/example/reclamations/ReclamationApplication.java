package com.example.reclamations;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ReclamationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReclamationApplication.class, args);
	}

	@Bean
	ApplicationRunner init(ReclamationRepository repository) {
		return args -> {
			Stream.of("Patient", "Drill", "StopAlgic").forEach(email -> {
				repository.save(new Reclamation(email));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
