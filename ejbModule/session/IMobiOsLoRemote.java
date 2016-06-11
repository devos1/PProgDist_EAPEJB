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
	// Gestion des véhicules
	// ======================================
	public void addVehicule(Vehicule v) throws PersistException;
	
	// ======================================
	// Gestion des stations       
	// ======================================
	public List<Station> getStations() throws PersistException;
	// Nombre de places libres pour pouvoir render le véhicule
	public int getFreePlacesCount() throws PersistException;
	// Nombre de vélos disponibles pour pouvoir louer
	public int getFreeByciclesCount() throws PersistException;
	// Nombre d'autos disponibles pour pouvoir louer
	public int getFreeAutoCount() throws PersistException;
	
}
