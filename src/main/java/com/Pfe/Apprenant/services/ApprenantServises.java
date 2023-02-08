package com.Pfe.Apprenant.services;

import java.util.List;

import com.Pfe.Apprenant.entities.Apprenant;

public interface ApprenantServises {
	
Apprenant saveApprenant(Apprenant A);
Apprenant updateApprenant(Apprenant A);

void deletApprenant(Apprenant A);
void deletApprenantById(long id);
Apprenant getApprenant(long id);
List<Apprenant> getAllApprenant();








}
