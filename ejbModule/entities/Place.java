package entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "place")
	//@OneToOne()
	private Vehicule vehicule;

	@ManyToOne
	@JoinColumn()
	//@JoinColumn(nullable = false, updatable = true, insertable = true)
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
		System.out.println("Entré dans le setVehicule");
		if (vehicule == null) {
			this.vehicule = null;
		}else {
			this.vehicule = vehicule;			
		}
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}
	
	
	
}
