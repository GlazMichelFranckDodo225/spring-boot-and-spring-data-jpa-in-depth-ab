package com.dgmf.config;

import com.dgmf.FirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("firstBean")
	public FirstClass firstBean() {
		return new FirstClass("First Bean");
	}

	@Bean("secondBean")
	public FirstClass secondBean() {
		return new FirstClass("Second Bean");
	}
}
