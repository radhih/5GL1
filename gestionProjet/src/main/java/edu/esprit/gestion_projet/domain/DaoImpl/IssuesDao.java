package edu.esprit.gestion_projet.domain.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.domain.IDao.IIssuesDao;

@Repository
public class IssuesDao implements IIssuesDao {
	
	@PersistenceContext
	EntityManager em;

	
	public void createIssue(Issues issue) {
		em.persist(issue);		
	}

	public void updateIssue(Issues issue) {
		em.merge(issue);		
	}

	public void closeIssue(Issues issue) {
		em.merge(issue);
	}

	public void assignIssuesProject(List<Issues> listIssues, Projet projet) {
		projet.affectProjetIssues(listIssues);
		em.merge(projet);

		
	}

	public void assignIssueToUser(Issues issue, User user) {
		user.setListIssues(new ArrayList<Issues>());
		user.getListIssues().add(issue);
		em.merge(user);
		
	}

	public List<Issues> getListIssuesByUsers(User user) {
		List<Issues>listIssues=user.getListIssues();
		
		return listIssues;
	}

	public List<Issues> getListIssuesByProject(Projet projet) {

		String query="select i from Projet p join p.listIssues i " +
				"where i.projet=:projet"; 
		Query queryt= em.createQuery(query).setParameter("projet", projet);
		List<Issues>listIssues=queryt.getResultList();
		return listIssues;
				
		
	}

	public Issues findIssuesById(int id) {
		
		return em.find(Issues.class, id);
	}

}
