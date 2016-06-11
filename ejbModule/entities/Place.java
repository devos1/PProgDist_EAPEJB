package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Place implements Serializable{
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Fields            
	// ======================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EnumTypePlace type;

	@OneToOne(mappedBy = "place")
	private Vehicule vehicule;

	@ManyToOne
	private Station station;
	
	// ======================================
	//              Constructors            
	// ======================================
	public Place(){}

	public Place(EnumTypePlace type) {
		this.type = type;
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

	public EnumTypePlace getType() {
		return type;
	}

	public void setType(EnumTypePlace type) {
		this.type = type;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
	
	
	
}
