package com.dgmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		HelloWorld helloWorld = new HelloWorld();
		System.out.println(helloWorld.sayHello());
	}

}
