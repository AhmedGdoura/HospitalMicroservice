package com.example.providers;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(ProviderRepository repository) {
		return args -> {
			Stream.of("Provider1", "Provider2").forEach(name -> {
				repository.save(new Provider(name));
			});
			repository.findAll().forEach(System.out::println);
		};
	}

}
