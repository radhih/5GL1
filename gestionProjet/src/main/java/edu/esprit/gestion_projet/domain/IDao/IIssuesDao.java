package edu.esprit.gestion_projet.domain.IDao;

import java.util.List;

import edu.esprit.gestion_projet.domain.Entity.Issues;
import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;

public interface IIssuesDao {
	
	public void createIssue(Issues issue);
	public void updateIssue(Issues issue);
	public void closeIssue(Issues issue);
	public  Issues findIssuesById(int id);
	public void assignIssuesProject(List<Issues>listIssues,Projet projet);
	public void assignIssueToUser(Issues issue,User user);
	public  List<Issues> getListIssuesByUsers(User user);
	public List<Issues> getListIssuesByProject(Projet projet);
	
	
	
	
	
	

}
