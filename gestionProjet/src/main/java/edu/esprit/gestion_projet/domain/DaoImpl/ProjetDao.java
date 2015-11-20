package edu.esprit.gestion_projet.domain.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.domain.IDao.IProjetDao;

@Repository
public class ProjetDao implements IProjetDao{

	@PersistenceContext
	EntityManager em;
	
	
	public void persistProjet(Projet projet) {
		em.persist(projet);
	}

	
	public void updateProjet(Projet projet) {
		em.merge(projet);		
	}

	
	public void deleteProjet(Projet projet) {
		em.remove(projet);	
	}

	
	public List<User> getUsersByProject(Projet projet) {
		String  query="select p.listUser  from Projet p where p=:projet";
		Query queryt= em.createQuery(query).setParameter("projet", projet);
		List<User>listUsers=queryt.getResultList();
		
		return listUsers;
	}

	
	public Projet findProjetById(int id) {
		return em.find(Projet.class, id);
	}

}
