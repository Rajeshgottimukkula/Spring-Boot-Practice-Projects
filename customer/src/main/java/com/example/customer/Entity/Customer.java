package com.example.customer.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
    private String customerName;
    private String customerContactNumber;
    private int customerBikeId;
	public Customer(int id, String customerName, String customerContactNumber, int customerBikeId) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.customerContactNumber = customerContactNumber;
		this.customerBikeId = customerBikeId;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerContactNumber() {
		return customerContactNumber;
	}
	public void setCustomerContactNumber(String customerContactNumber) {
		this.customerContactNumber = customerContactNumber;
	}
	public int getCustomerBikeId() {
		return customerBikeId;
	}
	public void setCustomerBikeId(int customerBikeId) {
		this.customerBikeId = customerBikeId;
	}
	
}
