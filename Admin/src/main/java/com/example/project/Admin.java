package com.example.project;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin implements Serializable{
	private static final long serialVersionUID = 6;
	
	@Id
	@GeneratedValue
	private int id;
	private int telephone,nbenfant;
	private float salaire;
	private String nom,prenom,email,grade,adresse,situation,dateNaissance,dateEmbauchement;
	public int getId() {
		return id;
	}
	public float getSalaire() {
		return salaire;
	}
	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getNbenfant() {
		return nbenfant;
	}
	public void setNbenfant(int nbenfant) {
		this.nbenfant = nbenfant;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getDateEmbauchement() {
		return dateEmbauchement;
	}
	public void setDateEmbauchement(String dateEmbauchement) {
		this.dateEmbauchement = dateEmbauchement;
	}
	public Admin() {
		super();
	}
	public Admin(String nom) {
		super();
		this.nom = nom;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
