package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@ComponentScan(basePackages="com")
@RestController
@RequestMapping("/")
@SpringBootApplication
public class SpringDemoApplication {

	@Autowired
	DataSourceConfig dev;
	
	@RequestMapping(method=RequestMethod.GET)
	public String home()
	{
		
		return "Hello World Amdocs ";
	}
	
	
	
	@Bean
	public ApplicationRunner asd()
	{
		return (args)-> 
					System.out.println("asdfasdf"+dev.getProps());
		
	}
	
	
	public static void main(String[] args) {
		
		SpringApplication application=new SpringApplication(SpringDemoApplication.class);
		application.setWebEnvironment(true);
		
		application.run(args);
//		SpringApplication.run(SpringDemoApplication.class, args);
	}
}
