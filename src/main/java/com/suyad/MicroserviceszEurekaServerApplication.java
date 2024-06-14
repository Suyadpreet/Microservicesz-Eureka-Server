package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceszEurekaServerApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroserviceszEurekaServerApplication.class, args);
		System.out.println("Eureka Server Has been Started Successfully...........");
	}

}
