package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Voiture {
	@Id
	@GeneratedValue
	private int id;
	
	private Enum carburant;

	private Enum boite;
}
