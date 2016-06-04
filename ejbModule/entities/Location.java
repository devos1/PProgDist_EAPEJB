package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Location implements Serializable {	
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Champs            
	// ======================================
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date debut;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date fin;
	
	@Column(columnDefinition = "Decimal(8,1)", nullable = false)
	private double nbKM;

	@ManyToOne // A VOIR ENCORE
	private Station station;

	@ManyToOne // A VOIR ENCORE
	private Vehicule vehicule;

	@ManyToOne // A VOIR ENCORE
	private Utilisateur utilisateur;
	
	// ======================================
	//              Constructeur            
	// ======================================
	public Location(){}
	
	public Location(Date debut, Date fin, double nbKM, Station station, Vehicule vehicule, Utilisateur utilisateur) {
		this.debut = debut;
		this.fin = fin;
		this.nbKM = nbKM;
		this.station = station;
		this.vehicule = vehicule;
		this.utilisateur = utilisateur;
	}

	// ======================================
	//           Getters & Setters            
	// ======================================
	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public double getNbKM() {
		return nbKM;
	}

	public void setNbKM(double nbKM) {
		this.nbKM = nbKM;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public Vehicule getVehicule() {
		return vehicule;
	}

	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
}
