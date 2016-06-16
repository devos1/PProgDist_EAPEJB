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
	public void delCatVehicule(int id) throws PersistException;
	
	// ======================================
	// Gestion des véhicules
	// ======================================
	public void addVehicule(Vehicule v) throws PersistException;
	public Vehicule getVehicule(int id) throws PersistException;
	public void attributePlaceToVehicule(Vehicule v, Place p) throws PersistException;
	public List<Vehicule> getVehicules() throws PersistException;
	
	// ======================================
	// Gestion des places
	// ======================================
	public void addPlace(Place p) throws PersistException;
	public void removeVehicule(int id) throws PersistException;
	
	// ======================================
	// Gestion des stations       
	// ======================================
	public void addStation(Station s) throws PersistException;
	public List<Station> getStations() throws PersistException;
	public Station getStation(int id) throws PersistException;
	
	// Nombre de places libres pour pouvoir render le véhicule
	public int getFreePlacesCount() throws PersistException; 	// A supprimer, pas besoin 
	// Nombre de vélos disponibles pour pouvoir louer
	public int getFreeByciclesCount() throws PersistException; 	// A supprimer, pas besoin
	// Nombre d'autos disponibles pour pouvoir louer
	public int getFreeAutoCount() throws PersistException;		// A supprimer, pas besoin	
	
}
