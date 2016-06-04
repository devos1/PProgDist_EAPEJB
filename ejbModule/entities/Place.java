package entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Place {

	private Enum type;

	@OneToOne(mappedBy = "place")
	private Vehicule vehicule;

	@ManyToOne
	private Station station;
	
}
