package com.luv2code.springdemo.dao;

import java.util.List;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;

public interface hackerdao {
	public List<hacker> allHackers();
	
	public hacker savehacker(hacker theCustomer);

	public hacker getahacker(int theId);

	public int deleteahacker(int theId);
	
	public List<hacker> hackerLoginCheck(String mobilenumber);
}
