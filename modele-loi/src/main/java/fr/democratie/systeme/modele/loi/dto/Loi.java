package fr.democratie.systeme.modele.loi.dto;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import fr.democratie.systeme.modele.loi.enumeration.StatutLoi;

/**
 * 
 * @author Arrindos
 *
 */
@Entity
public class Loi {

	private String identifiant;

	private CategorieLoi categorie;

	private LocalDateTime dateDeCreation;

	private StatutLoi statut;
	
	private String description;
	
	private String contenu;
	

}
