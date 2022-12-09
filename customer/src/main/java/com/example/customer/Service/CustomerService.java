package com.example.customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.Entity.Customer;
import com.example.customer.Repository.CustomerRepo;

@Service
public class CustomerService {

	@Autowired
	CustomerRepo cr;
	
	public Customer saveCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return cr.save(cust);
	}

	public List<Customer> fetchCustomers() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	public Customer findByCustomerName(String name) {
		// TODO Auto-generated method stub
		return cr.findByCustomerName(name);
	}

}
