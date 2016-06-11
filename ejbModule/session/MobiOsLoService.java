package session;

import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import entities.CategorieVehicule;
import entities.Place;
import entities.Station;
import entities.Vehicule;

@Stateful
public class MobiOsLoService implements IMobiOsLo, IMobiOsLoRemote {

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<CategorieVehicule> getCatVehicules() throws PersistException {
		try {
			return em.createQuery("SELECT c FROM CategorieVehicule c").getResultList();
		} catch (PersistenceException pe) {
			pe.printStackTrace();
			throw new PersistenceException(pe.getMessage());
		}
	}

	@Override
	public void addCatVehicule(CategorieVehicule catVehicule) throws PersistException {
		em.merge(catVehicule);
	}

	@Override
	public CategorieVehicule getCatVehicule(int id) throws PersistException {
		return em.find(CategorieVehicule.class, id);
	}

	@Override
	public void delCatVehicule(int id) throws PersistException {
		em.remove(getCatVehicule(id));
	}

	@Override
	public List<Station> getStations() throws PersistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getFreePlacesCount() throws PersistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFreeByciclesCount() throws PersistException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFreeAutoCount() throws PersistException {
		// TODO Auto-generated method stub
		return 0;
	}

	// ======================================
	//              VEHICULES            
	// ======================================
	@Override
	public void addVehicule(Vehicule v) throws PersistException {
		em.merge(v);
	}
	
	// ======================================
	//              PLACES           
	// ======================================
	@Override
	public void addPlace(Place p) throws PersistException {
		em.merge(p);
	}
	
}
