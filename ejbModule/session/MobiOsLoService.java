package session;

import java.util.List;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;

import entities.CategorieVehicule;

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
}
