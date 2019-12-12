package com.example.microservices.devices;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "device")
public class Device {
	@Id
	private int numSerie;
	private String manufacturer;
	private int quantity;
	private int price;
	private List<String> sensors;
	public int getNumSerie() {
		return numSerie;
	}
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<String> getSensors() {
		return sensors;
	}
	public void setSensors(List<String> sensors) {
		this.sensors = sensors;
	}
	
	

}
