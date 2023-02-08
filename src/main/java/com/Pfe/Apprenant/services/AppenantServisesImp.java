package com.Pfe.Apprenant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PatchMapping;

import com.Pfe.Apprenant.entities.Apprenant;
import com.Pfe.Apprenant.repos.ApprenantRepository;
@Service

public class AppenantServisesImp implements ApprenantServises{
	
	
	@Autowired
	
	ApprenantRepository apprenantRepository ;

	@Override
	public Apprenant saveApprenant(Apprenant A) {
		// TODO Auto-generated method stub
		return apprenantRepository.save(A);
	}

	@Override
	public Apprenant updateApprenant(Apprenant A) {
		
		return apprenantRepository.save(A);
	}
	
	
	@Override
	public void deletApprenant(Apprenant A) {
		// TODO Auto-generated method stub
		apprenantRepository.delete( A);
	}

	@Override
	public void deletApprenantById(long id) {
		// TODO Auto-generated method stub
		apprenantRepository.deleteById( id);
	}

	@Override
	public Apprenant getApprenant(long id) {
		// TODO Auto-generated method stub
		return apprenantRepository.findById(id).get();
	}

	@Override
	public List<Apprenant> getAllApprenant() {
		// TODO Auto-generated method stub
		return apprenantRepository.findAll();
	}

}
