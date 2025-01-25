package com.client;

import java.util.Scanner;

import com.model.Employee;
import com.servicei.servicei;
import com.serviceimpl.serviceimpl;

public class Test {

	public static void main(String[] args) throws Exception{
		Employee e = new Employee();
		servicei s = new serviceimpl();
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
			System.out.println("*****************Menu*******************");
			
			System.out.println("1:Add employee");
			System.out.println("2:View emoployee");
			System.out.println("3:update employee");
			System.out.println("4:Delete employee");
			System.out.println("5:View all employee");
			System.out.println("6:Data retrival using iterator");
			
			System.out.println("Enter choice");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				
				
				s.addemployee(e);
				
				break;
				
			}
			case 2: {
				System.out.println("Enter Employee ID");
						
				s.viewemployee(e);
				break;
				}
			case 3: {
				
			
				
				@SuppressWarnings("unused")
				Employee emp = new Employee();
				
				break;
				}
				
				
			
			
			case 4: {
				
				
				Employee emp = new Employee();
				
				s.deleteemployee(emp);
				break;
			}
				
			case 5: {
				System.out.println("All Employee data");
				
				Employee emp = new Employee();
				s.viewallemployee(emp);
				
				break;
				
			}
			
			case 6:{
				System.out.println("Retrival of data using iterator");
				
				s.iterateemployee(e);
				break;
			}
			
			
			}

}
		}
		
	}
}