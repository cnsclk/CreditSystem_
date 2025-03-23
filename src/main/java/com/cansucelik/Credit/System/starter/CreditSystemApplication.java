package com.cansucelik.Credit.System.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.cansucelik.Credit.System"})
@SpringBootApplication
@ComponentScan(basePackages = {"com.cansucelik.Credit.System"})
@EnableJpaRepositories(basePackages = {"com.cansucelik.Credit.System"})
public class CreditSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditSystemApplication.class, args);
	}

}
