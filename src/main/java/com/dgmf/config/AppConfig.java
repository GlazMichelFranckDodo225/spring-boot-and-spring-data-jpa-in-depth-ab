package com.dgmf.config;

import com.dgmf.FirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("myBean")
	public FirstClass helloWorld() {
		return new FirstClass("First Bean");
	}
}
