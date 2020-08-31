package com.company;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class CompanyServiceApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CompanyServiceApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		// TODO Auto-generated method stub	
	}
}
