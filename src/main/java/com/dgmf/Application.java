package com.dgmf;

import com.dgmf.service.FirstService;
import com.dgmf.service.impl.FirstServiceImpl;
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
		FirstServiceImpl firstService =
                context.getBean(FirstServiceImpl.class);
		System.out.println(firstService.tellAStory());
		System.out.println(firstService.getCustomProperty());
		System.out.println(firstService.getMyProp());
		System.out.println(firstService.getMyPropTwo());
	}
}
