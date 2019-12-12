package com.example.microservices.devices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.microservices.devices")
public class ApplicationConfig {

	 @Bean(name="deviceService")
	    public DeviceService getTopoService() {
	        return new DeviceServiceImpl();
	    }
	 
	 
}
