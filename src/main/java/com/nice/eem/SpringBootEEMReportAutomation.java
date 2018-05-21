package com.nice.eem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
@ComponentScan(basePackages = "com.nice.eem")
public class SpringBootEEMReportAutomation {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEEMReportAutomation.class, args);
	}
}
