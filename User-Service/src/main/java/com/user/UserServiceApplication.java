package com.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.user.dao.UserDAO;
import com.user.entity.User;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class UserServiceApplication implements CommandLineRunner {
	
	
	@Autowired
	UserDAO userDao;
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	 @Bean
	 public Docket docket() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.any())              
	          .paths(PathSelectors.any())                          
	          .build();                                           
	    }

	@Override
	public void run(String... args) throws Exception {
		long phone = 9999999999L;
		boolean conf =true;
		User user = new User("admin","admin","ADMIN","admin@gmail.com",phone,conf);
		userDao.save(user);
	}

}
