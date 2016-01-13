package fr.democratie.systeme.modele.vote.dto;

import javax.persistence.Entity;

import fr.democratie.systeme.modele.citoyen.dto.Citoyen;
import fr.democratie.systeme.modele.loi.dto.Loi;

@Entity
public class VoteCitoyenLoi {

	private Vote vote;
	
	private Loi loi;
	
	private Citoyen citoyen;
	
}
