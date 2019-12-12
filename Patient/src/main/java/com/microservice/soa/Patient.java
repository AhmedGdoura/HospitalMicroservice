package com.microservice.soa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Patient implements Serializable {
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private String name,lastname;
	private int numero;
	private String email;
	
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(String name) {
		super();
		this.name = name;
	}
	public Patient(int id, int numero, String name, String lastname,String email) {
		super();
		this.id = id;
		this.numero = numero;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
	}




	

}
