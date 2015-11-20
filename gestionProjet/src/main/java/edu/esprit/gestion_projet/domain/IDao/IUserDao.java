package edu.esprit.gestion_projet.domain.IDao;

import edu.esprit.gestion_projet.domain.Entity.Developer;
import edu.esprit.gestion_projet.domain.Entity.Reporter;
import edu.esprit.gestion_projet.domain.Entity.User;

public interface IUserDao {
	
	public void persistUser(User user);
	public void persistReporter(Reporter repo);
	public void persistDeveloper(Developer dev);
	public User findUserById(int id);
	public void updateUser(User user);
	public void authenticate(String login,String password);
	
	

}
