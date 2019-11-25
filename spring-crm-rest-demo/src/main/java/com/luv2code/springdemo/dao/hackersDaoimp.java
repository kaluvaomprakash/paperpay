package com.luv2code.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;
import com.luv2code.springdemo.entity.hacker;
@Repository
public class hackersDaoimp implements hackerdao{
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public List<hacker> allHackers() {
		// TODO Auto-generated method stub
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
						
				// create a query  ... sort by last name
				Query<hacker> theQuery = currentSession.createQuery("from hacker",hacker.class);
				
				// execute query and get result list
				List<hacker> hackers = theQuery.getResultList();
						
				// return the results		
				return hackers;
		
	}
	@Override
	public hacker savehacker(hacker thehacker) {
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// save/upate the customer ... finally LOL
				currentSession.saveOrUpdate(thehacker);
				return thehacker;
	}
	@Override
	public hacker getahacker(int theId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();
				
				// now retrieve/read from database using the primary key
				hacker ahacker = currentSession.get(hacker.class, theId);
				
				return ahacker;
	}
	@Override
	public int deleteahacker(int theId) {
		// get the current hibernate session
			Session currentSession = sessionFactory.getCurrentSession();
			
			// delete object with primary key
			Query theQuery = currentSession.createQuery("delete from hacker where id=:hackerId");
			theQuery.setParameter("hackerId", theId);
			
			return theQuery.executeUpdate();		
	}
	@Override
	public List<hacker> hackerLoginCheck(String mobilenumber) {
				Session currentSession = sessionFactory.getCurrentSession();
				Query theQuery = currentSession.createQuery("select count(mobile_number) as mcount from hacker where mobile_number=:mNum");
				theQuery.setParameter("mNum", mobilenumber);
				System.out.println("output1 "+theQuery.uniqueResult());
				int count = Integer.parseInt(theQuery.uniqueResult().toString());
				System.out.println("count "+count);
				if(count>=1) { 
					  System.out.println("count of select "+count); 
					  theQuery = currentSession.createQuery("select id from hacker where mobile_number=:mNum");
				  theQuery.setParameter("mNum", mobilenumber);
				  System.out.println("after running query "+theQuery.uniqueResult());
				  int hak_id = Integer.parseInt(theQuery.uniqueResult().toString());
				  theQuery = currentSession.createQuery("from Customer where hId=:hackrId");
				  theQuery.setParameter("hackrId", hak_id);
				  List<hacker> hackers = theQuery.list();
				  System.out.println(hackers);
			return hackers;
				  
				  } else { 
					  System.out.println("in else");
				  System.out.println(theQuery.uniqueResult());
				  return (List<hacker>) theQuery.uniqueResult();
				  }
				
		//return null;
	}

}
