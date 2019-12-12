package com.example.reclamations;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reclamation implements Serializable {
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private String desc;
	private String email;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Reclamation() {
		super();
	}

	public Reclamation(int id, String desc, String email) {
		super();
		this.id = id;
		this.desc = desc;
		this.email = email;
	}
	public Reclamation(String email2) {
		// TODO Auto-generated constructor stub
	}



}
