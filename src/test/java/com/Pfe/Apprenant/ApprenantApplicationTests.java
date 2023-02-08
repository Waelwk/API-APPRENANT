package com.Pfe.Apprenant;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.Pfe.Apprenant.entities.Apprenant;
import com.Pfe.Apprenant.repos.ApprenantRepository;

@SpringBootTest
class ApprenantApplicationTests {
	@Autowired
private ApprenantRepository  apprenantRepository;
	
	@Test
	public void testCreateApprenant() {
	Apprenant appre = new Apprenant("wael ","kmel ","homme",new Date(),"wael-kamel@outllok.fr",21345678,"tawite",false); 
	 apprenantRepository.save(appre);
	}}
