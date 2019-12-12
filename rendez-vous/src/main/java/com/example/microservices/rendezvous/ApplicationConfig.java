package com.example.microservices.rendezvous;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.microservices.rendezvous")
public class ApplicationConfig {

	 @Bean(name="rendezvousService")
	    public RendezVousService getTopoService() {
	        return new RendezVousServiceImpl();
	    }
}
