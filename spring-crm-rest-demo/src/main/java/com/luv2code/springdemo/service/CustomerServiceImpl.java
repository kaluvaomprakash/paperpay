package com.luv2code.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.dao.hackersDaoimp;
import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	@Autowired
	private hackersDaoimp hakcerdao;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public Customer saveCustomer(Customer theCustomer) {

		return customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public int deleteCustomer(int theId) {
		
		return customerDAO.deleteCustomer(theId);
	}

	@Override
	public Object checkCustomerlogin(String mobilenumber) {
		return customerDAO.customerLoginCheck(mobilenumber);
	}

	
	// **** All hacker things start from here
	
	@Override
	@Transactional
	public List<hacker> getHackers() {
		return hakcerdao.allHackers();
	}

	@Override
	@Transactional
	public hacker savehacker(hacker thehacker) {
		return hakcerdao.savehacker(thehacker);
	}

	@Override
	@Transactional
	public hacker getaHacker(int theId) {
		return hakcerdao.getahacker(theId);
	}

	@Override
	@Transactional
	public int deletehacker(int theId) {
		return hakcerdao.deleteahacker(theId);
	}

	@Override
	@Transactional
	public List<hacker> checkHackerlogin(String mobilenumber) {
		return hakcerdao.hackerLoginCheck(mobilenumber);
	}

	
}





