package com.example;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoProjectForJenkinsDockerApplication {

	public static Logger logger = LoggerFactory.getLogger(DemoProjectForJenkinsDockerApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application started...  ");
	}

	public static void main(String[] args) {
		logger.info("Application executed...   ");
		SpringApplication.run(DemoProjectForJenkinsDockerApplication.class, args);
	}

}
