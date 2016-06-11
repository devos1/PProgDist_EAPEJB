package session;

import java.util.List;
import javax.ejb.Remote;
import entities.*;

@Remote
public interface IMobiOsLoRemote {
	
	// ======================================
	// Gestion des catégories de véhicules            
	// ======================================
	public List<CategorieVehicule> getCatVehicules() throws PersistException;
	public void addCatVehicule(CategorieVehicule catVehicule) throws PersistException;
	public CategorieVehicule getCatVehicule(int id) throws PersistException;
	public void delCatVehicule(int id) throws PersistException;
	
	// ======================================
	// A FAIRE        
	// ======================================
	
}
