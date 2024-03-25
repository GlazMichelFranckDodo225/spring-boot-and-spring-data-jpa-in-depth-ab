package com.dgmf.config;

import com.dgmf.FirstClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppConfig {
	// @Profile("dev")
	@Bean("firstBean")
	// @Qualifier("Bean1")
	// @Primary
	public FirstClass firstBean() {
		return new FirstClass("First Bean");
	}

	// @Profile("test")
	@Bean("secondBean")
	// @Qualifier("Bean2")
	public FirstClass secondBean() {
		return new FirstClass("Second Bean");
	}

	// @Profile("custom")
	@Bean("thirdBean")
	// @Primary
	// @Qualifier("Bean3")
	public FirstClass thirdBean() {
		return new FirstClass("Third Bean");
	}
}
