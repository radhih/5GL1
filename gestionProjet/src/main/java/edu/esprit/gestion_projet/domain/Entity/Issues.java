package edu.esprit.gestion_projet.domain.Entity;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Issues
 *
 */
@Entity

public class Issues implements Serializable {

	
	private Integer id_Issues;
	private String name;
	private String description;
	private Date dateStart;
	private Date dateEnd;
	private Date estimationTime;
	private String priority;
	private String type;
	List<User>listuser= new ArrayList<User>();
	private Projet projet;

	@ManyToMany(mappedBy="listIssues")
	public List<User> getListuser() {
		return listuser;
	}
	public void setListuser(List<User> listuser) {
		this.listuser = listuser;
	}

	private static final long serialVersionUID = 1L;

	public Issues() {
		super();
	}  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getId_Issues() {
		return this.id_Issues;
	}

	public void setId_Issues(Integer id_Issues) {
		this.id_Issues = id_Issues;
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
	public Date getDateStart() {
		return this.dateStart;
	}

	public void setDateStart(Date dateStart) {
		this.dateStart = dateStart;
	} 
	@Temporal(TemporalType.DATE)
	public Date getDateEnd() {
		return this.dateEnd;
	}

	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	} 
	@Temporal(TemporalType.DATE)
	public Date getEstimationTime() {
		return this.estimationTime;
	}

	public void setEstimationTime(Date estimationTime) {
		this.estimationTime = estimationTime;
	}   
	public String getPriority() {
		return this.priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@ManyToOne
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
   
}
