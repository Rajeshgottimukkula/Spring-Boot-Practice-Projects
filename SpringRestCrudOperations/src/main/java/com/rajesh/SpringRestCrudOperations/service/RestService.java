package com.rajesh.SpringRestCrudOperations.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.rajesh.SpringRestCrudOperations.Entity.Mobiles;
import com.rajesh.SpringRestCrudOperations.repo.Repo;

@Service
public class RestService {

	
	@Autowired
	Repo reposit;
	public Mobiles saveToDb(Mobiles mbls) {
		// TODO Auto-generated method stub
		return reposit.save(mbls);
	}
	public List<Mobiles> fetchAllMobiles() {
		// TODO Auto-generated method stub
		return reposit.findAll();
	}
	public Mobiles fetchByName(String name) {
		// TODO Auto-generated method stub
		return reposit.findByName(name);
	}

    public String deleteById(long id) {   	

    	reposit.deleteById(id);
		return "Deleted succesfully";
}
	


}
