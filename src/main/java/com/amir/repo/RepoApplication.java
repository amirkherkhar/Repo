package com.amir.repo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RepoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepoApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(MedjanaRepository medjanaRepository){
		return args -> {
			Medjana amir = new Medjana( 
				"Amir",
			 "kherkhar",
			  "kherkhar.amir@wissalacademy",
			   20
		);
		
		medjanaRepository.save(amir);
	};
	};
}
