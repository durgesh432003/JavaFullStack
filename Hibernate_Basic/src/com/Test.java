package com;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Test {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.setRollno(2);
		s.setName("Adinath");
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Transaction t = session.beginTransaction();
		
		session.update(s);
		t.commit();
		
		

	}

	

}
