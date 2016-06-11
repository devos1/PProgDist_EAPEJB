package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Abonnement implements Serializable{
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Champs            
	// ======================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDebut;

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFin;

	@Column(nullable = false)
	private boolean paye = false;

	@OneToOne(mappedBy = "abonnement") // A VOIR ENCORE
	private Utilisateur utilisateur;

	// ======================================
	//              Constructeurs            
	// ======================================
	public Abonnement() {}
	
	public Abonnement(Date dateDebut, Date dateFin, boolean paye, Utilisateur utilisateur) {
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.paye = paye;
		this.utilisateur = utilisateur;
	}

	// ======================================
	//           Getters & Setters            
	// ======================================
	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public boolean isPaye() {
		return paye;
	}

	public void setPaye(boolean paye) {
		this.paye = paye;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}	
}
