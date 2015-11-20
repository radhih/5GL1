package edu.esprit.gestion_projet.services.IService;

import edu.esprit.gestion_projet.domain.Entity.Developer;
import edu.esprit.gestion_projet.domain.Entity.Reporter;
import edu.esprit.gestion_projet.domain.Entity.User;

public interface IUserManager {
	
	public void createUser(User user );
	public void updateUser(User user);
	public void createReporter(Reporter repo);
	public void createDeveloper(Developer dev);
	public User getUserById(int id);
	public void authentication(String login,String password);
	
	

}
