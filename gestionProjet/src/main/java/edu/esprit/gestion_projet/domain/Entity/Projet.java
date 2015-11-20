package edu.esprit.gestion_projet.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Projet
 *
 */
@Entity

public class Projet implements Serializable {

	
	private Integer idProjet;
	private String name;
	private String description;
	private Date date;
	List<User>listUser= new ArrayList<User>();
	List<Issues>listIssues= new ArrayList<Issues>();

	
@OneToMany(mappedBy="projet",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<Issues> getListIssues() {
		return listIssues;
	}
	public void setListIssues(List<Issues> listIssues) {
		this.listIssues = listIssues;
	}
	@ManyToMany(mappedBy="listprojet",cascade=CascadeType.ALL)
	public List<User> getListUser() {
		return listUser;
	}
	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}

	private static final long serialVersionUID = 1L;

	public Projet() {
		super();
	}   
	
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	} 
	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void affectProjetIssues(List<Issues> issue)
	{
		
	for(Issues issu:issue)
	{
		issu.setProjet(this);
		this.getListIssues().add(issu);
	}
		
		
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdProjet() {
		return idProjet;
	}
	public void setIdProjet(Integer idProjet) {
		this.idProjet = idProjet;
	}
   
}
