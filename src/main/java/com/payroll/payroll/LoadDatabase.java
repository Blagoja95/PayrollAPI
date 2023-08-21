package com.payroll.payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase
{
	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(EmployeeRopository repository)
	{

		return args -> {
			log.info("Preloading " + repository.save(new Employee("Jovan Jovanovic", "Employee")));
			log.info("Preloading " + repository.save(new Employee("Petar Petrovic", "Boss")));
			log.info("Preloading " + repository.save(new Employee("Marko Markovic", "HR")));
		};
	}
}
