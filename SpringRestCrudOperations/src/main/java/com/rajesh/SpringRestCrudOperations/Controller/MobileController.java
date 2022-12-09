package com.rajesh.SpringRestCrudOperations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.SpringRestCrudOperations.Entity.Mobiles;
import com.rajesh.SpringRestCrudOperations.service.RestService;

@RestController
public class MobileController {

	
	
	@Autowired
	RestService rs;
	
	@PostMapping("/Mobiles")
	public Mobiles saveToDb(@RequestBody Mobiles mbls) {
		return rs.saveToDb(mbls);
	}
	
	@GetMapping("/Mobiles")
	public List<Mobiles> fetchAllMobiles(){
		return rs.fetchAllMobiles();
	}
	@GetMapping("/Mobiles/{name}")
	public Mobiles fetchByName(@PathVariable("name") String name) {
		return rs.fetchByName(name);
	}
	
	
	@DeleteMapping("/Mobiles/{id}")
	public String deleteById(@PathVariable("id") long id) {
		return rs.deleteById(id);
	}
}
