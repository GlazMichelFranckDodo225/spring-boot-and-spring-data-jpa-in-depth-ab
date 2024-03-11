package com.dgmf.config;

import com.dgmf.FirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("firstClass")
	public FirstClass firstClass() {
		return new FirstClass("First Class Bean");
	}
}
