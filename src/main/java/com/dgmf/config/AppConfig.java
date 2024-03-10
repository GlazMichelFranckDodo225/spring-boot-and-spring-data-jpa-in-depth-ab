package com.dgmf.config;

import com.dgmf.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("myBean")
	public HelloWorld helloWorld() {
		return new HelloWorld("First Bean");
	}
}
