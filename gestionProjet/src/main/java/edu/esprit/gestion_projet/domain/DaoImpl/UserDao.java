package edu.esprit.gestion_projet.domain.DaoImpl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import edu.esprit.gestion_projet.domain.Entity.Developer;
import edu.esprit.gestion_projet.domain.Entity.Reporter;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.domain.IDao.IUserDao;

@Repository
public class UserDao implements IUserDao {

	@PersistenceContext
	EntityManager em;
	
	
	
	public void persistUser(User user) {
		em.persist(user);		
	}


	
	public void persistReporter(Reporter repo) {
		em.persist(repo);		
	}


	
	public void persistDeveloper(Developer dev) {
		em.persist(dev);		
	}


	
	public void authenticate(String login, String password) {

		String query="select u from User u where u.login= :login and u.password=:password";
		Query queryt=em.createQuery(query).setParameter("login", login).
				setParameter("password", password);
		try{
			User user= (User) queryt.getSingleResult();
		}
		catch(Exception e){
			System.out.println("User not found");
		}
	}


	
	public User findUserById(int id) {
		return em.find(User.class, id);
	}


	
	public void updateUser(User user) {
		em.merge(user);		
	}

	

}
