package edu.esprit.gestion_projet.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class User implements Serializable {

	
	private Integer id_User;
	private String name;
	private String e_mail;
	private String login;
	private String password;
	
	List<Projet>listprojet= new ArrayList<Projet>();
	
	List<Issues>listIssues= new ArrayList<Issues>();

	
	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	
	public List<Issues> getListIssues() {
		return listIssues;
	}
	public void setListIssues(List<Issues> listIssues) {
		this.listIssues = listIssues;
	}
	@ManyToMany
	public List<Projet> getListprojet() {
		return listprojet;
	}
	public void setListprojet(List<Projet> listprojet) {
		this.listprojet = listprojet;
	}

	private static final long serialVersionUID = 1L;

	public User() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_User() {
		return this.id_User;
	}

	public void setId_User(Integer id_User) {
		this.id_User = id_User;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getE_mail() {
		return this.e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}   
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
   
}
