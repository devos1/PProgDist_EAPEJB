package entities;

import java.io.Serializable;
import java.util.Currency;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CategorieVehicule implements Serializable {	
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Champs            
	// ======================================
	@Id
	@GeneratedValue
	private int id;
	
	@Column(nullable = false, length = 40)
	private String nomCategorie;

	@Column(columnDefinition = "Decimal(5,2)", nullable = false)
	private Currency prixUnitaire;
	
	@Column(columnDefinition = "Decimal(5,2)", nullable = false)
	private Currency prixKM;

	private Enum unite;

	// ======================================
	//              Constructeur            
	// ======================================
	public CategorieVehicule(){}

	public CategorieVehicule(String nomCategorie, Currency prixUnitaire, Currency prixKM, Enum unite) {
		this.nomCategorie = nomCategorie;
		this.prixUnitaire = prixUnitaire;
		this.prixKM = prixKM;
		this.unite = unite;
	}

	// ======================================
	//           Getters & Setters            
	// ======================================
	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public Currency getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Currency prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Currency getPrixKM() {
		return prixKM;
	}

	public void setPrixKM(Currency prixKM) {
		this.prixKM = prixKM;
	}

	public Enum getUnite() {
		return unite;
	}

	public void setUnite(Enum unite) {
		this.unite = unite;
	}

	
}
