package com.example.customer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.customer.Entity.Customer;
import com.example.customer.ResponseTemplateVO.Bikes;
import com.example.customer.ResponseTemplateVO.ResponseTemplateVO;
import com.example.customer.Service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService cs;
	
	
	@PostMapping("/")
	public Customer saveCustomer(@RequestBody Customer cust) {
		return cs.saveCustomer(cust);
	}
	
	@GetMapping("/")
	public List<Customer> fetchCustomers(){
		return cs.fetchCustomers();
		
	}
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{name}")
	public ResponseTemplateVO customerWithBikeDetails(@PathVariable("name") String name) {
		Customer customer=cs.findByCustomerName(name);
		Bikes bike=restTemplate.getForObject("http://localhost:8060/Bikes/"+customer.getCustomerBikeId(), Bikes.class);
		
		
		ResponseTemplateVO vo=new ResponseTemplateVO();
		
		vo.setCustomer(customer);
		vo.setBike(bike);
		return vo;
		
	}
	
}
