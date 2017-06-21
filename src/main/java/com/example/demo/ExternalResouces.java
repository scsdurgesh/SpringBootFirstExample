package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class ExternalResouces{

	Logger logger=Logger.getLogger(ExternalResouces.class);
	@Bean
	public String printSPEL(@Value("${configuration.projectName}") String projectName){
		
		System.out.println("IN SPEL"+projectName);
		return "SPEL";
	}
	@Bean
	public String printEnvironment(Environment emv) {
		// TODO Auto-generated method stub
		System.out.println("Envoi"+emv.getProperty("configuration.projectName"));
		return "Env";
	}
	@Bean
	public String printConfig(@Autowired MYConfigutationProperty cp)
	{
		
		System.out.println("Config File"+cp.getProjectName());
		return "config";
	}
	
}
