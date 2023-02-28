package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.Student;

public class Registerstudent {

public static boolean main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
		System.out.println("Enter Email :");
		String email= sc.next();
		
		System.out.println("Enter Password : ");
		String pass= sc.next();
		
		System.out.println("Enter Student Name : ");
		String name= sc.next();
		
		
		
		
		Student std= new Student();
		std.setEmail(email);
        std.setName(name);
		std.setPassword(pass);
		
		StudentDao st= new StudentDaoImpl();
		
		try {
			String res=st.registration(std);
			
			return true;
			
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
	
	
}
