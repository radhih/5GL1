package edu.esprit.gestion_projet.domain.Entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Developer
 *
 */
@Entity

public class Developer extends User implements Serializable {

	
	private String codeDeveloper;
	private static final long serialVersionUID = 1L;

	public Developer() {
		super();
	}   
	public String getCodeDeveloper() {
		return this.codeDeveloper;
	}

	public void setCodeDeveloper(String codeDeveloper) {
		this.codeDeveloper = codeDeveloper;
	}
   
}
