package com.elseff.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ProjectApplication {
	@RequestMapping("/")
	public String hello(){
		return "Hello!";
	}

	@RequestMapping("/welcome")
	public String welcome(){
		return "Welcome!";
	}

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
