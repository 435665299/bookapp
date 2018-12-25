package com.baidu.test.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisConfig {
	
	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource(){
		return new BasicDataSource();		
	}
}
