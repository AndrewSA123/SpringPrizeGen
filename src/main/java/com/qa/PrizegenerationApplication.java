package com.qa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.persistence.repository.PrizeRepository;
import com.qa.service.PrizeService;

@SpringBootApplication
public class PrizegenerationApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrizegenerationApplication.class, args);
	}

	@Bean
	public PrizeService getPrizeService() {
		PrizeService service = new PrizeService();
		service.setRepo(this.getRepo());
		return service;
	}

	@Bean
	public PrizeRepository getRepo() {
		return new PrizeRepository();
	}
}
