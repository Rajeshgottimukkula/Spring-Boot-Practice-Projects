package com.example.demo.Service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Bikes;
import com.example.demo.Repo.BikeRepo;

@Service
public class BikeService {

	
	@Autowired
	BikeRepo br;
	public List<Bikes> fetchBikes() {
		// TODO Auto-generated method stub
		return br.findAll();
		
	}
	public Bikes saveBike(Bikes bike) {
		// TODO Auto-generated method stub
		return br.save(bike);
	}
	public void removeBike(String name) {
		// TODO Auto-generated method stub
		br.deleteByBikeName(name);
		
		
	}
	public Bikes updateBike(Bikes bike, String name) {
		// TODO Auto-generated method stub
		Bikes extBike=br.findByBikeName(name);
		if(Objects.nonNull(bike.getBikeName())) {
			extBike.setBikeName(bike.getBikeName());
			
		}
		if(Objects.nonNull(bike.getBikeCC())) {
			extBike.setBikeCC(bike.getBikeCC());
		}
		if(Objects.nonNull(bike.getBikePrice())) {
			extBike.setBikePrice(bike.getBikePrice());
		}
		return br.save(extBike);
		
	}
	public Bikes fetchBikeById(int id) {
		// TODO Auto-generated method stub
		return br.findById(id).get();
	}

}
