package com.example.demo;

import javax.annotation.PostConstruct;

import org.apache.catalina.startup.Tomcat;
import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Tomcat.class)
@ConditionalOnProperty(name="log-tomcat-version",matchIfMissing=true)
public class LogTomcatVersionAutoConfiguration {

	Logger logger=Logger.getLogger(LogTomcatVersionAutoConfiguration.class);
	
	@PostConstruct
	public void logVersionNumnber()
	{
		logger.info("Tomcat Version "+Tomcat.class.getPackage().getImplementationVersion());
	}
	
}
