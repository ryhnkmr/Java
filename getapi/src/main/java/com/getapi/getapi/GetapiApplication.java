package com.getapi.getapi;

import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class GetapiApplication {
	static JdbcTemplate jdbc;

	public static void main(String[] args) {
		SpringApplication.run(GetapiApplication.class, args);
	}
}
