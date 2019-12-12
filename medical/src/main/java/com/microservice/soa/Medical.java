package com.microservice.soa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Medical implements Serializable {
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private String name,lastname;
	
	private String maladi;
	private String traitement;
	private String medicament;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	public String getMaladi() {
		return maladi;
	}

	public void setMaladi(String maladi) {
		this.maladi = maladi;
	}

	public String getTraitement() {
		return traitement;
	}

	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}

	public String getMedicament() {
		return medicament;
	}

	public void setMedicament(String medicament) {
		this.medicament = medicament;
	}

	public Medical() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medical(String name) {
		super();
		this.name = name;
	}
	public Medical(int id,  String name, String lastname,String medicament,String maladi,String traitement) {
		super();
		this.id = id;
		this.medicament = medicament;
		this.name = name;
		this.lastname = lastname;
		this.maladi = maladi;
		this.traitement=traitement;
	}




	

}
