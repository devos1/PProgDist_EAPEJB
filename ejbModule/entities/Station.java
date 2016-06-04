package entities;

import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Station {

	private List places;

	private int posX;

	private int posY;

	private String nom;

	private String pays;

	private String ville;

	@OneToMany(mappedBy = "station")
	private Collection<Place> place;

	@OneToMany(mappedBy = "station")
	private Collection<Location> location;

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
