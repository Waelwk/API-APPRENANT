package com.Pfe.Apprenant.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Pfe.Apprenant.entities.Apprenant;
import com.Pfe.Apprenant.services.ApprenantServises;
@RestController
@RequestMapping("/api")
@CrossOrigin


public class ApprenantApi {
	
	@Autowired
	ApprenantServises apprenantServises ;
	
	@RequestMapping(method=RequestMethod.GET)
	
	public List<Apprenant> getAllApprenant() {
		// TODO Auto-generated method stub
		return apprenantServises.getAllApprenant();
		
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Apprenant getApprenantById(@PathVariable("id") Long id) {
		return apprenantServises.getApprenant(id);
	}
	@RequestMapping(method = RequestMethod.POST)
	public Apprenant createApprenant(@RequestBody Apprenant apprenant) {
	return apprenantServises.saveApprenant(apprenant);
	}

@RequestMapping(method = RequestMethod.PUT)
public Apprenant updateApprenantt(@RequestBody Apprenant apprenant) {
return apprenantServises.updateApprenant(apprenant);

}

@RequestMapping(value="/{id}",method = RequestMethod.DELETE) 
public void deletApprenant(@PathVariable("id") Long id)
{
	apprenantServises.deletApprenantById(id);}

}