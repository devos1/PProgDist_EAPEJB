package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategorieVehicule implements Serializable {	
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Champs            
	// ======================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 40)
	private String nomCategorie;

	@Column(columnDefinition = "Decimal(5,2)", nullable = false)
	private Double prixUnitaire;
	
	@Column(columnDefinition = "Decimal(5,2)", nullable = false)
	private Double prixKM;

	private int unite;

	// ======================================
	//              Constructeur            
	// ======================================
	public CategorieVehicule(){}

	public CategorieVehicule(String nomCategorie, Double prixUnitaire, Double prixKM, int unite) {
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

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Double getPrixKM() {
		return prixKM;
	}

	public void setPrixKM(Double prixKM) {
		this.prixKM = prixKM;
	}

	public int getUnite() {
		return unite;
	}

	public void setUnite(int unite) {
		this.unite = unite;
	}

	
}
