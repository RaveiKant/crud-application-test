package com.exchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.exchange.service.ExchangeService;
import com.exchange.shared.UserRequest;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class ExchangeServiceApplication implements CommandLineRunner {
	
	@Autowired
	ExchangeService serv;
	public static void main(String[] args) {
		SpringApplication.run(ExchangeServiceApplication.class, args);
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
		
		UserRequest req1 = new UserRequest("NSE","A good and old exchange","Mumbai, Maharashatra, India", "Validated");
		UserRequest req2 = new UserRequest("BSE","A good and old exchange","Mumbai, Maharashatra, India", "Validated");
		serv.addExchange(req1);
		serv.addExchange(req2);
	}
	

}
