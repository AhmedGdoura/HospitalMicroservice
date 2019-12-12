package com.example.microservices.DeviceMeasurments;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "deviceMeasurments")
public class DeviceMeasurments {
	@Id
	private int id;
	private int numSerie;
	private int idPatient;
	private Date date;
	private List<Measurment> Measurments;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public int getIdPatient() {
		return idPatient;
	}
	public void setIdPatient(int idPatient) {
		this.idPatient = idPatient;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Measurment> getMeasurments() {
		return Measurments;
	}
	public void setMeasurments(List<Measurment> measurments) {
		Measurments = measurments;
	}


}
