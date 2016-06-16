package entities;

import java.io.Serializable;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Velo extends Vehicule implements Serializable {

	// ======================================
	//                 Fields            
	// ======================================
	
	// REMARQUE : Pas d'ID car héritage
	
	private String entrainement;

	private int categorie;
	
	// ======================================
	//              Constructors            
	// ======================================
	public Velo(){}

	public Velo(String entrainement, int categorie) {
		this.entrainement = entrainement;
		this.categorie = categorie;
	}

	// ======================================
	//           Getters & Setters            
	// ======================================
	public String getEntrainement() {
		return entrainement;
	}

	public void setEntrainement(String entrainement) {
		this.entrainement = entrainement;
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}
	
	
	
	
}
