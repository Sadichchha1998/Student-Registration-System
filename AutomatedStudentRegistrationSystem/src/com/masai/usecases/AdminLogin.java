package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.main.Main;
import com.masai.model.Admin;

public class AdminLogin {

	public static boolean main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Name");
		String name=sc.next();
		
		System.out.println("Enter Password");
		String pass=sc.next();
		
		
		
		
		AdministratorDao ad= new AdministratorDaoImpl();
	
		try {
			
			ad.adminLogin(name, pass);
			
	System.out.println("Login Succesfully");
			return true;
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		return false;
		}
		
		
	}
	
}
