package edu.esprit.gestion_projet.domain.IDao;

import java.util.List;

import edu.esprit.gestion_projet.domain.Entity.Projet;
import edu.esprit.gestion_projet.domain.Entity.User;

public interface IProjetDao {
	
	
	public void persistProjet(Projet projet);
	public void updateProjet(Projet projet);
	public void deleteProjet(Projet projet);
	public List<User> getUsersByProject(Projet projet);
	public  Projet findProjetById(int id);
	
	
	
	

}
