package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;

public interface CustomerService {

	public List<Customer> getCustomers();

	public Customer saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public int deleteCustomer(int theId);
	
	public Object checkCustomerlogin(String mobilenumber);
	
//*****hackers things
	
	public List<hacker> getHackers();
	
	public hacker savehacker(hacker thehacker);

	public hacker getaHacker(int theId);

	public int deletehacker(int theId);
	
	public Object checkHackerlogin(String mobilenumber);
	
	
	
}
