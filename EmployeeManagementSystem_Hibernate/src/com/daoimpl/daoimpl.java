package com.daoimpl;


import com.model.Employee;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.config.HibernateUtil;
import com.daoi.*;

public class daoimpl implements daoi  {

	@Override
	public void addemployee(Employee e) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.persist(e);
		t.commit();
		System.out.println("Employee added successfulyyy...");
		
	}
	
	@SuppressWarnings("unused")
	public void viewemployee(Employee e) {
		 
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		Employee emp=session.get(Employee.class,e.getEid());
		System.out.println("Employee Name: " + emp.getEid() + "\nEmployee Name: " + emp.getEname() + 
				"\nEmployee Designation: " + emp.getDesignation() + "\nEmployee Salary" + emp.getSalary());
	}

	@SuppressWarnings("deprecation")
	@Override
	public void updateemployee(Employee emp) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		
		
		session.update(emp);
		
		Employee emp1=session.get(Employee.class,emp.getEid());
		System.out.println("Employee Name: " + emp1.getEid() + "\nEmployee Name: " + emp1.getEname() + 
				"\nEmployee Designation: " + emp1.getDesignation() + "\nEmployee Salary" + emp1.getSalary());
	
		t.commit();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void deleteemployee(Employee emp) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		
		session.delete(emp);
		t.commit();
		
	}

	@Override
	public void viewallemployee(Employee emp) {
		
		try {
            
			   	Session session = HibernateUtil.getSessionFactory().openSession();
				@SuppressWarnings("unused")
				Transaction t = session.beginTransaction();
				
                    Query<Employee> query=session.createQuery("from Employee",Employee.class);
                    
                             List<Employee> list=query.getResultList();
                             
                             list.forEach(emp1->{
                            	 System.out.println("Employee Name: " + emp1.getEid() + "\nEmployee Name: " + emp1.getEname() + 
  	            				"\nEmployee Designation: " + emp1.getDesignation() + "\nEmployee Salary" + emp1.getSalary()
  	            				+ "\n**********************************************");
                             });
				
//		
//                Method made by me
//				int i ;
//				
//	            	for (i = 101; i < 110; i++) {
//						
//	            		
//	            		
//	            		Employee emp1 =session.get(Employee.class,i);
//	            		System.out.println("Employee Name: " + emp1.getEid() + "\nEmployee Name: " + emp1.getEname() + 
//	            				"\nEmployee Designation: " + emp1.getDesignation() + "\nEmployee Salary" + emp1.getSalary());
//	            		
//	            	}
		}
		
		finally {
			System.out.println("build again");
		}
	            
		       
		}

	@Override
	public void iterateemployee(Employee e) {
		
		
		try {
			
			Session session = HibernateUtil.getSessionFactory().openSession();
			@SuppressWarnings("unused")
			Transaction t = session.beginTransaction();
			
			
			Query<Employee> emp = session.createQuery("from Employee",Employee.class);
			
			List<Employee> em = emp.getResultList();
			
			Iterator<Employee> itr = em.iterator();
			
			while (itr.hasNext()) {
				
				Employee em1 = itr.next();
				
				System.out.println("Employee Name: " + em1.getEid() + "\nEmployee Name: " + em1.getEname() + 
          				"\nEmployee Designation: " + em1.getDesignation() + "\nEmployee Salary" + em1.getSalary()
          				+ "\n**************************************************");
				
			}
			
		}
		
		finally {
			System.out.println("build again");
		}
	}
		
	}

	

	
	
	
