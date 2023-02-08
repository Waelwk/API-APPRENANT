package com.Pfe.Apprenant.Api;
import org.springframework.data.rest.core.config.Projection;

import com.Pfe.Apprenant.entities.Apprenant;
@Projection(name = "nomApprenant", types = { Apprenant.class })
public interface ApprenantProjection {
	
	
		public String getNomApprenant(); 
		

}

