package com.example.jersey;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.jersey.entity.Compte;
import com.example.jersey.entity.TypeCompte;
import com.example.jersey.repository.CompteRepository;

@SpringBootApplication
public class JaxRsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JaxRsApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args->{
			Compte c1 = new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT);
			Compte c2 = new Compte(null, Math.random() * 9000, new Date(), TypeCompte.EPARGNE);
			Compte c3 = new Compte(null, Math.random() * 9000, new Date(), TypeCompte.COURANT);

			compteRepository.save(c1);
			compteRepository.save(c2);
			compteRepository.save(c3);

			
			compteRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}
	
}
