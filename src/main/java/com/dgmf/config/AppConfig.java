package com.dgmf.config;

import com.dgmf.FirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
	@Bean("firstBean")
	// @Qualifier("Bean1")
	@Primary
	public FirstClass firstBean() {
		return new FirstClass("First Bean");
	}

	@Bean("secondBean")
	// @Qualifier("Bean2")
	public FirstClass secondBean() {
		return new FirstClass("Second Bean");
	}

	@Bean("thirdBean")
	// @Primary
	// @Qualifier("Bean3")
	public FirstClass thirdBean() {
		return new FirstClass("Third Bean");
	}
}
