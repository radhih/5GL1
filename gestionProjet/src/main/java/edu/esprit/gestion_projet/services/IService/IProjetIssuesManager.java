package edu.esprit.gestion_projet.services.IService;

import java.util.List;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;

public interface IProjetIssuesManager {

	

	public void createProjet(Projet projet);
	public void updateProjet(Projet projet);
	public void deleteProjet(Projet projet);
	public List<User> getUsersByProject(Projet projet);
	public  Projet getProjetById(int id);
	public  Issues getIssuesById(int id);
	public void createIssue(Issues issue);
	public void updateIssue(Issues issue);
	public void closeIssue(Issues issue);
	public void assignIssuesProject(List<Issues>listIssues,Projet projet);
	public void assignIssueToUser(Issues issue,User user);
	public  List<Issues> getListIssuesByUsers(User user);
	public List<Issues> getListIssuesByProject(Projet projet);
}
