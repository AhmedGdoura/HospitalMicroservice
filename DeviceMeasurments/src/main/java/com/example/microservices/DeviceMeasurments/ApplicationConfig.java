package com.example.microservices.DeviceMeasurments;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.microservices.DeviceMeasurments")
public class ApplicationConfig {

	 @Bean(name="deviceMeasumentsService")
	    public DeviceMeasurmentsService getTopoService() {
	        return new DeviceMeasurmentsServiceImpl();
	    }
	 
	 
}