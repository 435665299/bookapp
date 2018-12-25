package com.baidu.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baidu.test.mapper")
public class SpringBootMain {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMain.class, args);
	}

}
