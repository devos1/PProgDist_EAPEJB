package session;

import java.util.List;
import javax.ejb.Local;
import entities.*;

@Local
public interface IMobiOsLo {
	
	// ======================================
	// Gestion des catégories de véhicules            
	// ======================================
	public List<CategorieVehicule> getCatVehicules() throws PersistException;
	public void addCatVehicule(CategorieVehicule catVehicule) throws PersistException;
	public CategorieVehicule getCatVehicule(int id) throws PersistException;
	
	// ======================================
	// A FAIRE        
	// ======================================
	
}
