package com.dgmf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);
		// HelloWorld helloWorld = new HelloWorld();

		// Get Bean from IoC - V1
		// ConfigurableApplicationContext
		var context = SpringApplication.run(Application.class, args);
		// HelloWorld helloWorld = context.getBean(HelloWorld.class);
		HelloWorld helloWorld =
				context.getBean("helloWorld", HelloWorld.class);
		System.out.println(helloWorld.sayHello());
	}
}
