package com.example.customer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.customer.Entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

	Customer findByCustomerName(String name);

}
