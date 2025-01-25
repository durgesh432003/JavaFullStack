package com.serviceimpl;

import java.util.Scanner;

import com.daoi.daoi;
import com.daoimpl.daoimpl;
import com.model.Employee;
import com.servicei.servicei;

public class serviceimpl implements servicei{
	
	daoi d = new daoimpl();
	Scanner sc = new Scanner(System.in);
	@Override
	public void addemployee(Employee e) {
		System.out.println("Enter employee id");
		e.setEid(sc.nextInt());
		System.out.println("Enter employee name");
		e.setEname(sc.next());
		System.out.println("Enter employee designation");
		e.setDesignation(sc.next());
		System.out.println("Enter employee salary");
		e.setSalary(sc.nextDouble());
		d.addemployee(e);
		
	}

	@Override
	public void viewemployee(Employee e) {
		System.out.println("Enter employee id");
	
		d.viewemployee(e);
		
	}

	@Override
	public void updateemployee(Employee emp) {
			d.updateemployee(emp);
	}

	@Override
	public void deleteemployee(Employee emp) {
		System.out.println("Enter the Employee Id of retired Employee");
		
		emp.setEid(sc.nextInt());
		d.deleteemployee(emp);
		
	}

	@Override
	public void viewallemployee(Employee emp) {
		d.viewallemployee(emp);
		
	}

	@Override
	public void iterateemployee(Employee e) {
		
		d.iterateemployee(e);
	}
	
	
	
	

}
