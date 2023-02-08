package com.Pfe.Apprenant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.Pfe.Apprenant.entities.Apprenant;

@SpringBootApplication
public class ApprenantApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(ApprenantApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception { repositoryRestConfiguration.exposeIdsFor(Apprenant.class);
	
	}
}
