package entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Vehicule implements Serializable{
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Fields            
	// ======================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar miseEnServiceDt;

	private String couleur;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EnumCatPrix catPrix;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EnumMarque marque;

	@Column(nullable = false)
	private String modele;

	@OneToOne()
	private Utilisateur utilisateur;

	@OneToOne()
	private Place place;

	@OneToMany(mappedBy = "vehicule")
	private Collection<Reservation> reservation;

	@OneToMany(mappedBy = "vehicule")
	private Collection<Location> location;
	
	// ======================================
	//              Constructors            
	// ======================================
	public Vehicule(){}

	public Vehicule(Calendar miseEnServiceDt, String couleur, EnumCatPrix catPrix, EnumMarque marque, String modele) {
		this.id = id;
		this.miseEnServiceDt = miseEnServiceDt;
		this.couleur = couleur;
		this.catPrix = catPrix;
		this.marque = marque;
		this.modele = modele;
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

	public Calendar getMiseEnServiceDt() {
		return miseEnServiceDt;
	}

	public void setMiseEnServiceDt(Calendar miseEnServiceDt) {
		this.miseEnServiceDt = miseEnServiceDt;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public EnumCatPrix getCatPrix() {
		return catPrix;
	}

	public void setCatPrix(EnumCatPrix catPrix) {
		this.catPrix = catPrix;
	}

	public EnumMarque getMarque() {
		return marque;
	}

	public void setMarque(EnumMarque marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public Collection<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Collection<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Collection<Location> getLocation() {
		return location;
	}

	public void setLocation(Collection<Location> location) {
		this.location = location;
	}
}
