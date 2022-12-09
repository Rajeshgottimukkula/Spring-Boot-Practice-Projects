package com.rajesh.SpringRestCrudOperations.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.rajesh.SpringRestCrudOperations.Entity.Mobiles;
@Repository
public interface Repo extends JpaRepository<Mobiles,Long>{
	
   public Mobiles findByName(String name);
  
}
