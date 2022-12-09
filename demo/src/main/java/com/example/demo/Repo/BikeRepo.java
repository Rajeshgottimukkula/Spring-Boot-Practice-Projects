package com.example.demo.Repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Bikes;

@Repository
public interface BikeRepo extends JpaRepository<Bikes,Integer> {
    @Transactional
	void deleteByBikeName(String name);

	Bikes findByBikeName(String name);

}
