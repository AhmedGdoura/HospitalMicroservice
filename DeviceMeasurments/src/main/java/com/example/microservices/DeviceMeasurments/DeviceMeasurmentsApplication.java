package com.example.microservices.DeviceMeasurments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeviceMeasurmentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeviceMeasurmentsApplication.class, args);
	}

}
