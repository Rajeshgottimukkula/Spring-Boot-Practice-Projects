package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Bikes;
import com.example.demo.Service.BikeService;

@RestController
@RequestMapping("/Bikes")
public class BikeController {

	
	@Autowired
	BikeService bs;
	
	@GetMapping("/")
	public List<Bikes> fetchBikes(){
		return bs.fetchBikes();
		
	}
	
	@GetMapping("/{id}")
	public Bikes fetchBikeById(@PathVariable("id") int id) {
		return bs.fetchBikeById(id);
	}
	@PostMapping("/")
	public Bikes saveBike(@RequestBody Bikes bike) {
		return bs.saveBike(bike);
	}
	
	@DeleteMapping("/{name}")
	public  String removeBike(@PathVariable("name") String name) {
		bs.removeBike(name);
		return name+" has been deleted";
		}
	
	@PutMapping("/{name}")
	public Bikes updateBike(@RequestBody Bikes bike,@PathVariable("name") String name) {
		return bs.updateBike(bike,name);
	}
}
