package com.app.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.app")
public class DockerApplication  {
	
	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}
}
