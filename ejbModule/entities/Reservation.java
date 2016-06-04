package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	private Date debut;

	private Date fin;

	@ManyToOne
	private Vehicule vehicule;

	@OneToOne(mappedBy = "reservation")
	private Utilisateur utilisateur;
	
}
