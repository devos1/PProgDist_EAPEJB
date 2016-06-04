package entities;

import java.util.Collection;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehicule {

	private Date miseEnServiceDt;

	private String couleur;

	private Enum catPrix;

	private Enum marque;

	private Enum modele;

	@OneToOne()
	private Utilisateur utilisateur;

	@OneToOne()
	private Place place;

	@OneToMany(mappedBy = "vehicule")
	private Collection<Reservation> reservation;

	@OneToMany(mappedBy = "vehicule")
	private Collection<Location> location;
	
}
