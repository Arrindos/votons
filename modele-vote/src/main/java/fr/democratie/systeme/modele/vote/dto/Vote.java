package fr.democratie.systeme.modele.vote.dto;

import javax.persistence.Entity;

import fr.democratie.systeme.modele.loi.dto.Loi;
import fr.democratie.systeme.modele.vote.enumeration.ValeurVoteEnum;

/**
 * 
 * @author Arrindos
 *
 */
@Entity
public class Vote {

	private String identifiant;
	
	private Loi loi;
	
	private ValeurVoteEnum valeur;
	
}
