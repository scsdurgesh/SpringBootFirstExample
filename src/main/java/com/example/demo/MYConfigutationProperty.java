package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("configuration")
public class MYConfigutationProperty {

	private String projectName;

	public String getProjectName() {
		System.out.println("ProjectName Getter");
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

}
