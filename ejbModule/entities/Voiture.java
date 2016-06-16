package entities;

import java.io.Serializable;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Voiture extends Vehicule implements Serializable {
	
	// ======================================
	//                 Fields            
	// ======================================
	
	// REMARQUE : Pas d'ID car héritage
	
	private String carburant;

	private String boite;

	// ======================================
	//              Constructors            
	// ======================================
	public Voiture(){}
	
	public Voiture(String carburant, String boite) {
		this.carburant = carburant;
		this.boite = boite;
	}

	// ======================================
	//           Getters & Setters            
	// ======================================

	public String getCarburant() {
		return carburant;
	}

	public void setCarburant(String carburant) {
		this.carburant = carburant;
	}

	public String getBoite() {
		return boite;
	}

	public void setBoite(String boite) {
		this.boite = boite;
	}
	
	
	
}
