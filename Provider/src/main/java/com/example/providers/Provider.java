package com.example.providers;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Provider implements Serializable {
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private String name, email;
	private int num;
	
	public Provider(int id, String name, String email, int num) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.num = num;
	}

	public Provider(String name) {
		super();
		this.name = name;
	}

	public Provider() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}	

}
