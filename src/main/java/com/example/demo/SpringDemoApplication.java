package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication
public class SpringDemoApplication {

	
	@RequestMapping(method=RequestMethod.GET)
	public String home()
	{
		return "Hello World Amdocs ";
	}
	public static void main(String[] args) {
		
		SpringApplication application=new SpringApplication(SpringDemoApplication.class);
		application.setWebEnvironment(true);
		application.run(args);
//		SpringApplication.run(SpringDemoApplication.class, args);
	}
}
