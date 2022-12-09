package com.rajesh.SpringRestCrudOperations.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobiles {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mobileId;
	private String name;
	private String price;
	private String RAM;
	private String storage;
	private String camera;
	
	
	public Mobiles(long mobileId, String mobileName, String price, String rAM, String storage, String camera) {
		super();
		this.mobileId = mobileId;
		this.name = mobileName;
		this.price = price;
		RAM = rAM;
		this.storage = storage;
		this.camera = camera;
	}
	
	public Mobiles() {
		
	}
	
	public long getMobileId() {
		return mobileId;
	}
	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}
	public String getName() {
		return name;
	}
	public void setName(String mobileName) {
		this.name = mobileName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRAM() {
		return RAM;
	}
	public void setRAM(String rAM) {
		RAM = rAM;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public String getCamera() {
		return camera;
	}
	public void setCamera(String camera) {
		this.camera = camera;
	}
	
	
	
	
}
