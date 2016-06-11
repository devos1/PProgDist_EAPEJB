package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Station implements Serializable {
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Fields            
	// ======================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int posX;

	private int posY;

	private String nom;

	private String pays;

	private String ville;

	@OneToMany(mappedBy = "station")
	private Collection<Place> place;

	@OneToMany(mappedBy = "station")
	private Collection<Location> location;

	// ======================================
	//              Constructors            
	// ======================================
	public Station(){}
	
	public Station(int id, int posX, int posY, String nom, String pays, String ville) {
		this.id = id;
		this.posX = posX;
		this.posY = posY;
		this.nom = nom;
		this.pays = pays;
		this.ville = ville;
	}

	// ======================================
	//           Getters & Setters            
	// ======================================
	public Vehicule louer(Enum typeVehicule) {
		return null;
	}

	public int rendre(Vehicule vehicule) {
		return 0;
	}

	public int cptPlacesLibres(Enum typeVehicule) {
		return 0;
	}

	public int cptVehiculesLibres(Enum typeVehicule) {
		return 0;
	}

	public int cptNbPlaces() {
		return 0;
	}

}
