package edu.esprit.gestion_projet.services.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.esprit.gestion_projet.domain.Entity.Developer;
import edu.esprit.gestion_projet.domain.Entity.Reporter;
import edu.esprit.gestion_projet.domain.Entity.User;
import edu.esprit.gestion_projet.domain.IDao.IUserDao;
import edu.esprit.gestion_projet.services.IService.IUserManager;

@Service("usmanager")
@Transactional
public class UserManager implements IUserManager{
	
	@Autowired
	private IUserDao userdao;

	public IUserDao getUserdao() {
		return userdao;
	}

	public void setUserdao(IUserDao userdao) {
		this.userdao = userdao;
	}

	
	public void createUser(User user) {
		userdao.persistUser(user);
		
	}

	
	public void createReporter(Reporter repo) {
		userdao.persistReporter(repo)		;
	}

	
	public void createDeveloper(Developer dev) {
		userdao.persistDeveloper(dev);		
	}

	
	public void authentication(String login, String password) {
		userdao.authenticate(login, password);
		
	}

	
	public User getUserById(int id) {
		return userdao.findUserById(id);
	}

	
	public void updateUser(User user) {
		userdao.updateUser(user);
	}

}
