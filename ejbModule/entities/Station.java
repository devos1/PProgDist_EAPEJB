package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

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
	
	@Transient
	private int nbVelosDispo;
	
	@Transient
	private int nbAutosDispos;
	
	@Transient
	private int placesLibres;

	@OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "station")	
	private List<Place> places;

	@OneToMany(mappedBy = "station")
	private Collection<Location> location;

	// ======================================
	//              Constructors            
	// ======================================
	public Station(){}
	
	public Station(int posX, int posY, String nom, String pays, String ville) {
		this.posX = posX;
		this.posY = posY;
		this.nom = nom;
		this.pays = pays;
		this.ville = ville;
		places = new ArrayList<Place>();
	}

	// ======================================
	//           Getters & Setters            
	// ======================================
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public int getNbVelosDispo() {
		return nbVelosDispo;
	}

	public void setNbVelosDispo(int nbVelosDispo) {
		this.nbVelosDispo = nbVelosDispo;
	}

	public int getNbAutosDispos() {
		return nbAutosDispos;
	}

	public void setNbAutosDispos(int nbAutosDispos) {
		this.nbAutosDispos = nbAutosDispos;
	}

	public int getPlacesLibres() {
		return placesLibres;
	}

	public void setPlacesLibres(int placesLibres) {
		this.placesLibres = placesLibres;
	}
	
	public Collection<Place> getPlaces() {
		return places;
	}

	public void setPlace(ArrayList<Place> places) {
		this.places = places;
	}

	public Collection<Location> getLocation() {
		return location;
	}

	public void setLocation(Collection<Location> location) {
		this.location = location;
	}

	// ======================================
	//             Functions         
	// ======================================
	public void addPlace(Place p){
		p.setStation(this);
		this.places.add(p);
	}
	
	public Vehicule louer(CategorieVehicule cv) {
		for (int i = 0; i < places.size(); i++) {
			Place p = places.get(i);
			if (p.getVehicule() != null && p.getType().equals(EnumTypePlace.Voiture)) {
				// On récupère la première place avec une voiture et on la retourne
				Vehicule v = p.getVehicule();
				// On enlève la voiture de la place				
				p.setVehicule(null);
				this.places.get(i).setVehicule(null);
				v.setPlace(null);
				return v;
			}
		}
		return null;
	}
	
	public Place rendre(Vehicule vehicule) {
		// Parcours pour trouver la 1ère place libre correspondant au type de véhicule
		// Type de véhicule passé en dur! 
		for (int i = 0; i < places.size() ; i++) {
			Place p = places.get(i);
			if (p.getVehicule() == null && p.getType().equals(EnumTypePlace.Voiture)) {
				return p;
			}
		}
		return null;
	}

	public int cptPlacesLibres(EnumTypePlace typePlace) {
		int nb = 0;
		for (Place place : places) {
			if (place.getVehicule() == null && place.getType().equals(typePlace)) {
				nb++;
			}
		}
		return nb;
	}

	public int cptVehiculesLibres(EnumTypePlace typePlace) {
		int nb = 0;
		for (Place place : places) {
			if (place.getVehicule() != null && place.getType().equals(typePlace)) {
				nb++;
			}
		}
		return nb;
	}

	public int cptNbPlaces() {
		return 0;
	}

}
