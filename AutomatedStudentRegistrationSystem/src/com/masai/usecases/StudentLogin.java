package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;

public class StudentLogin {

	
	public static boolean main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Email");
		 String email=sc.next();
		
		
		System.out.println("Enter pass");
		String pass= sc.next();
		
		StudentDao dtm= new StudentDaoImpl();
		
		try {
			
			System.out.println(dtm.login(email, pass));
			return true;
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
}
