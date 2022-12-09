package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bikes {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int bikeId;
	private String bikeName;
	private String bikePrice;
	private String bikeCC;
	public int getBikeId() {
		return bikeId;
	}
	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}
	public String getBikeName() {
		return bikeName;
	}
	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}
	public String getBikePrice() {
		return bikePrice;
	}
	public void setBikePrice(String bikePrice) {
		this.bikePrice = bikePrice;
	}
	public String getBikeCC() {
		return bikeCC;
	}
	public void setBikeCC(String bikeCC) {
		this.bikeCC = bikeCC;
	}
	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bikes(int bikeId, String bikeName, String bikePrice, String bikeCC) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.bikeCC = bikeCC;
	}
	
	
	
}
