package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;

public class UpdateFees {

	public static void main(String[] args) {
		
	Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter course id to update the fee");
		int cid= sc.nextInt();
		
		System.out.println("Enter updated amount ");
		int fee=sc.nextInt();
		
		
		AdministratorDao admin= new AdministratorDaoImpl();
		
		try {
			String reslt=admin.updateFee(cid, fee);
			System.out.println(reslt);
			
			
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
