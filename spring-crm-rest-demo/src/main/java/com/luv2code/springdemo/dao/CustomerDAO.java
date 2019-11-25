package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public Customer saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public int deleteCustomer(int theId);
	
	public Object customerLoginCheck(String mobilenumber);

	
	
	
	
}
