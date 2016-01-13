package fr.democratie.systeme.modele.citoyen.dto;

import javax.persistence.Entity;

/**
 * 
 * @author Arrindos
 *
 */
@Entity
public class Citoyen {
	
	/*
	 * Identifiant unique du citoyen
	 */
	private String identifiant;

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	

	
}
