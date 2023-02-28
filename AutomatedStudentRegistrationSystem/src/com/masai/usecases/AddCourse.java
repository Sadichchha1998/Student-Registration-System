package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Course;

public class AddCourse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course name : ");
		String cname= sc.next();
		System.out.println("Enter course fee : ");
		int fee=sc.nextInt();
		System.out.println("Enter course seats :");
		int seats= sc.nextInt();
		
		Course cr= new Course();
		cr.setC_name(cname);
		cr.setFee(fee);
		cr.setSeats(seats);
		
		AdministratorDao adm= new AdministratorDaoImpl();
		try {
		
			String res=adm.addCourse(cr);
			System.out.println(res);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
