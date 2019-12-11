package com.project.planning.planning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.project.planning.planning")
public class ApplicationConfig {

	 @Bean(name="planningService")
	    public PlanningService getTopoService() {
	        return new PlanningServiceImpl();
	    }

}
