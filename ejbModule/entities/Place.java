package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Place {

	@Id
	@GeneratedValue
	private int id;
	
	private Enum type;

	@OneToOne(mappedBy = "place")
	private Vehicule vehicule;

	@ManyToOne
	private Station station;
	
}
