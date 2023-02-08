package com.Pfe.Apprenant.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Apprenant {
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	private long idApprenant;
	private String nomApprenant;
	private String prenomApprenant;
	private String SexApprenant;
	private Date dateNaisanceApprenant;
	private String emailApprenant;
	private long  telApprenant;
	private String adresseApprenant;
	private boolean  archive = false ;
	
	public long getIdApprenant() {
		return idApprenant;
	}
	public void setIdApprenant(long idApprenant) {
		this.idApprenant = idApprenant;
	}
	public String getNomApprenant() {
		return nomApprenant;
	}
	
	public Apprenant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNomApprenant(String nomApprenant) {
		this.nomApprenant = nomApprenant;
	}
	public String getPrenomApprenant() {
		return prenomApprenant;
	}
	public void setPrenomApprenant(String prenomApprenant) {
		this.prenomApprenant = prenomApprenant;
	}
	public String getSexApprenant() {
		return SexApprenant;
	}
	public void setSexApprenant(String sexApprenant) {
		SexApprenant = sexApprenant;
	}
	public Date getDateNaisanceApprenant() {
		return dateNaisanceApprenant;
	}
	public void setDateNaisanceApprenant(Date dateNaisanceApprenant) {
		this.dateNaisanceApprenant = dateNaisanceApprenant;
	}
	public String getEmailApprenant() {
		return emailApprenant;
	}
	public void setEmailApprenant(String emailApprenant) {
		this.emailApprenant = emailApprenant;
	}
	public long getTelApprenant() {
		return telApprenant;
	}
	public void setTelApprenant(long telApprenant) {
		this.telApprenant = telApprenant;
	}
	public String getAdresseApprenant() {
		return adresseApprenant;
	}
	public void setAdresseApprenant(String adresseApprenant) {
		this.adresseApprenant = adresseApprenant;
	}
	public boolean isArchive() {
		return archive;
	}
	public void setArchive(boolean archive) {
		this.archive = archive;
	}
	
	public Apprenant(String nomApprenant, String prenomApprenant, String sexApprenant, Date dateNaisanceApprenant,
			String emailApprenant, long telApprenant, String adresseApprenant, boolean archive) {
		super();
		this.nomApprenant = nomApprenant;
		this.prenomApprenant = prenomApprenant;
		SexApprenant = sexApprenant;
		this.dateNaisanceApprenant = dateNaisanceApprenant;
		this.emailApprenant = emailApprenant;
		this.telApprenant = telApprenant;
		this.adresseApprenant = adresseApprenant;
		this.archive = archive;
	}
	@Override
	
	public String toString() {
		return "Apprenant [idApprenant=" + idApprenant + ", nomApprenant=" + nomApprenant + ", prenomApprenant="
				+ prenomApprenant + ", SexApprenant=" + SexApprenant + ", dateNaisanceApprenant="
				+ dateNaisanceApprenant + ", emailApprenant=" + emailApprenant + ", telApprenant=" + telApprenant
				+ ", adresseApprenant=" + adresseApprenant + ", archive=" + archive + "]";
	} 
	
	
	
	
	

}
