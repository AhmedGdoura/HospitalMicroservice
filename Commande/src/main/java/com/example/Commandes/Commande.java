package com.example.Commandes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
	private static final long serialVersionUID = 6;
	
	
	@Id
	@GeneratedValue
	private int id;
	private int idM;
	private int totalQty;
	private float totalprice;
	private String name;
	
	public Commande(int idC, int idM, int totalQty, float totalprice, String desc) {
		super();
		this.id = idC;
		this.idM = idM;
		this.totalQty = totalQty;
		this.totalprice = totalprice;
		this.name = desc;
	}

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(String desc) {
		super();
		this.name = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int idC) {
		this.id = idC;
	}

	public int getIdM() {
		return idM;
	}

	public void setIdM(int idM) {
		this.idM = idM;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public float getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}

	public String getDesc() {
		return name;
	}

	public void setDesc(String desc) {
		this.name = desc;
	}
	
	

}
