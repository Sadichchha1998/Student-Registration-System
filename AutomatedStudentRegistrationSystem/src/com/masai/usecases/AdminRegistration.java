package com.masai.usecases;

import java.net.SecureCacheResponse;
import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Admin;

public class AdminRegistration {

	public static boolean main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter name for admin login ");
	String name=sc.next();
	
	System.out.println("Enter pass for admin login ");
	String pass=sc.next();
	
	Admin admin= new Admin();
	admin.setName(name);
	admin.setPass(pass);
	
	
	AdministratorDao adt= new AdministratorDaoImpl();
	try {
		String res=adt.adminRegistration(admin);
		return true;
		
	} catch (AdminException e) {
		// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		
		return false;
	}
	
		
		
	}
	
	
}
