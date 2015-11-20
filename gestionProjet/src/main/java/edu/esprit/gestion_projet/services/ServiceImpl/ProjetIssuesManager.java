package edu.esprit.gestion_projet.services.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.domain.IDao.IIssuesDao;
import edu.esprit.gestion_projet.domain.IDao.IProjetDao;
import edu.esprit.gestion_projet.services.IService.IProjetIssuesManager;

@Service("projetIssue")
@Transactional
public class ProjetIssuesManager implements IProjetIssuesManager {

	@Autowired
	private IProjetDao projetdao;
	@Autowired
	private IIssuesDao issuedao;

	 
	public void createProjet(Projet projet) {
		projetdao.persistProjet(projet);
	}

	 
	public void updateProjet(Projet projet) {
		projetdao.updateProjet(projet);
	}

	 
	public void deleteProjet(Projet projet) {
		projetdao.deleteProjet(projet);
	}

	 
	public List<User> getUsersByProject(Projet projet) {

		return projetdao.getUsersByProject(projet);
	}

	 
	public void createIssue(Issues issue) {
		issuedao.createIssue(issue);
	}

	 
	public void updateIssue(Issues issue) {
		issuedao.updateIssue(issue);
	}

	 
	public void closeIssue(Issues issue) {
		issuedao.updateIssue(issue);
	}

	 
	public void assignIssuesProject(List<Issues> listIssues, Projet projet) {
		issuedao.assignIssuesProject(listIssues, projet);
	}

	 
	public void assignIssueToUser(Issues issue, User user) {

		issuedao.assignIssueToUser(issue, user);
	}

	 
	public List<Issues> getListIssuesByUsers(User user) {
		return issuedao.getListIssuesByUsers(user);
	}

	 
	public List<Issues> getListIssuesByProject(Projet projet) {
		return issuedao.getListIssuesByProject(projet);
	}

	 
	public Projet getProjetById(int id) {
		return projetdao.findProjetById(id);
	}

	 
	public Issues getIssuesById(int id) {
		return issuedao.findIssuesById(id);
	}

}
