package edu.esprit.gestion_projet.domain.Entity;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Reporter
 *
 */
@Entity

public class Reporter extends User implements Serializable {

	
	private String codReporter;
	private static final long serialVersionUID = 1L;

	public Reporter() {
		super();
	}   
	public String getCodReporter() {
		return this.codReporter;
	}

	public void setCodReporter(String codReporter) {
		this.codReporter = codReporter;
	}
   
}
