package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration

public class DataSourceConfig {

	private String props;
	
	public String getProps() {
		return props;
	}

	public void setProps(String props) {
		this.props = props;
	}

	@Bean @Profile("dev")
	@Qualifier("dev")
	DataSourceConfig dev()
	{
		setProps("Dev");
		return this;		
	}
	
	@Bean @Profile("cloud")
	DataSourceConfig cloud()
	{
		setProps("cloud");
		return this;		
	}
}
