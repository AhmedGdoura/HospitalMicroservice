package com.example.microservices.rendezvous;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "rendezvous")
public class RendezVous {
	@Id
	private int _id;
	private int idMedecin;
	private String emailMedecin;
	private int idPatient;
	private Date dateDebut;
	private Date dateFin;
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
	}
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public String getEmailMedecin() {
		return emailMedecin;
	}
	public void setEmailMedecin(String emailMedecin) {
		this.emailMedecin = emailMedecin;
	};
	
}
