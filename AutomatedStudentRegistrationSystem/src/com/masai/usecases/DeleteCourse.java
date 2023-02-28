package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.utility.ConsoleColors;

public class DeleteCourse {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
			System.out.println(ConsoleColors.ANSI_RED+"Enter course id to delete Course"+ConsoleColors.RESET);
			int cid= sc.nextInt();
			
		
			
			AdministratorDao adm= new AdministratorDaoImpl();
			
			try {
				String res=adm.deleteCourse(cid);
				System.out.println(res);
				
				
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
}
