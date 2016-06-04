package entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue
	private int id;
	
	private Date debut;

	private Date fin;

	@ManyToOne
	private Vehicule vehicule;

	@OneToOne(mappedBy = "reservation")
	private Utilisateur utilisateur;
	
}
