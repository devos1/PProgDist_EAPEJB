package entities;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Utilisateur {

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
