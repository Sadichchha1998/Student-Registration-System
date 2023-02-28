package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.Course;

public class InsertStudent {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Course Id  :");
		String cname= sc.next();
		System.out.println("Enter Batch Id : ");
		int bname=sc.nextInt();
		System.out.println("Enter Student Roll Number ");
		int roll= sc.nextInt();
		
		
		
		AdministratorDao admin= new AdministratorDaoImpl();
		
		try {
		String smt=	admin.allocateStudent(roll, bname, roll);
			System.out.println(smt);
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
