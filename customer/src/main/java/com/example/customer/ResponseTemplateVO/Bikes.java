package com.example.customer.ResponseTemplateVO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bikes {
	private String bikeName;
	private String bikePrice;
	private String bikeCC;
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
	public Bikes(String bikeName, String bikePrice, String bikeCC) {
		super();
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.bikeCC = bikeCC;
	}
	public Bikes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
