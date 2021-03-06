package com.betterbound.finaltraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class FinaltrainingApplication {
	static JdbcTemplate jdbc;
	public static void main(String[] args) {
		SpringApplication.run(FinaltrainingApplication.class, args);
	}

}
