package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Velo {

	@Id
	@GeneratedValue
	private int id;
	
	private Enum entrainement;

	private int categorie;
	
}
