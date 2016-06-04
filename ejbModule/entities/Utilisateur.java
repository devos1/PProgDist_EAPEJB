package entities;

import java.util.Collection;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
public class Utilisateur {

	@Id
	@GeneratedValue
	private int id;
	
	private String nom;

	private String prenom;

	@OneToOne(mappedBy = "utilisateur")
	private Vehicule vehicule;

	@OneToOne()
	private Reservation reservation;

	@OneToOne()
	private Abonnement abonnement;

	@OneToMany(mappedBy = "utilisateur")
	private Collection<Location> location;

	public int login() {
		return 0;
	}

	public int logout() {
		return 0;
	}
	
}
