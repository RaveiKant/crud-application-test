package com.sector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import com.sector.dto.SectorRequest;
import com.sector.service.SectorService;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class SectorServiceApplication implements CommandLineRunner{
	
	@Autowired
	private SectorService service;

	public static void main(String[] args) {
		SpringApplication.run(SectorServiceApplication.class, args);
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
		SectorRequest req = new SectorRequest();
		req.setName("Finance");
		req.setBrief("This sector deals with different financial service and companies of world");
		service.addSector(req);
		req.setName("Healthcare Services");
		req.setBrief("This sector deals with different Healthcare Services and companies of world");
		service.addSector(req);
		req.setName("Pharmaceuticals");
		req.setBrief("This sector deals with different Pharmaceuticals Services and companies of world");
		service.addSector(req);
		req.setName("Hotels");
		req.setBrief("This sector deals with all Hotels and hospitalities companies of world");
		service.addSector(req);
		req.setName("Internet Software and Services");
		req.setBrief("This sector deals with all Internet Software and Services companies of world");
		service.addSector(req);
	}

}
