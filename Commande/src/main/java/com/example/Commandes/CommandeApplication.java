package com.example.Commandes;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
public class CommandeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommandeApplication.class, args);
	}

	@Bean
	ApplicationRunner init(CommandeRepository repository) {
		return args -> {
			Stream.of("ZINOX Commande", "Drill Commande", "StopAlgic Commande").forEach(name -> {
				repository.save(new Commande(name));
			});
			repository.findAll().forEach(System.out::println);
		};
	}
}
