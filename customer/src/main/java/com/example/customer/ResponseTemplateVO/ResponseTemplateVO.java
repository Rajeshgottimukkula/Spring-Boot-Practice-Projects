package com.example.customer.ResponseTemplateVO;

import com.example.customer.Entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

	
	private Customer customer;
	private Bikes bike;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Bikes getBike() {
		return bike;
	}
	public void setBike(Bikes bike) {
		this.bike = bike;
	}
	public ResponseTemplateVO(Customer customer, Bikes bike) {
		super();
		this.customer = customer;
		this.bike = bike;
	}
	public ResponseTemplateVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
