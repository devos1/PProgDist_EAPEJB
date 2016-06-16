package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Enumerated;

@Entity
public class CategorieVehicule implements Serializable {	
	private static final long serialVersionUID = 1L;

	// ======================================
	//                 Fields            
	// ======================================
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column()
	@NotNull @NotEmpty @Size(max = 30)
	private String nomCategorie;

	@Column(columnDefinition = "Decimal(5,2)", nullable = false)
	private Double prixUnitaire;
	
	@Column(columnDefinition = "Decimal(5,2)", nullable = false)
	private Double prixKM;

	@Enumerated(EnumType.STRING)
	private EnumUnite unite;

	// ======================================
	//              Constructors            
	// ======================================
	public CategorieVehicule(){}

	public CategorieVehicule(String nomCategorie, Double prixUnitaire, Double prixKM, EnumUnite unite) {
		this.nomCategorie = nomCategorie;
		this.prixUnitaire = prixUnitaire;
		this.prixKM = prixKM;
		this.unite = unite;
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

	public EnumUnite getUnite() {
		return unite;
	}

	public void setUnite(EnumUnite unite) {
		this.unite = unite;
	}

	// ======================================
	//   Redéfinition de la méthode toString       
	// ======================================
	@Override
	public String toString() {
		return "CategorieVehicule [id=" + id + ", nomCategorie=" + nomCategorie + ", prixUnitaire=" + prixUnitaire
				+ ", prixKM=" + prixKM + ", unite=" + unite + "]";
	}

	
	
}
