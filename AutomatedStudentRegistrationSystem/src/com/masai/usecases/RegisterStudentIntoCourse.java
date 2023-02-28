package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class RegisterStudentIntoCourse {

	public static boolean main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Enter Email : ");
		String email= sc.next();
		
		System.out.println("Enter Password : ");
		String pass= sc.next();
		
		System.out.println("Enter Student Name : ");
		String name= sc.next();
		
		
		System.out.println("Enter course id in which You want to take admission");
		int cid= sc.nextInt();
		
		Student std= new Student();
		std.setEmail(email);
        std.setName(name);
		std.setPassword(pass);
		
		StudentDao stdm= new StudentDaoImpl();
		
		try {
			String reslt=stdm.studentRegistration(std,cid);
			System.out.println(reslt);
			return true;
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
	
}
