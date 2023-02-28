package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.InformationCourseDTO;

public class SearchInformationCourse {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter course id to Search Information about Course");
			int cid= sc.nextInt();
			
		
			
			AdministratorDao admin= new AdministratorDaoImpl();
			

			try {
			List<InformationCourseDTO> d=	admin.searchInformationOfCourse(cid);
				
			d.forEach(st->System.out.println(st));
				
			} catch (AdminException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
}
	
}
