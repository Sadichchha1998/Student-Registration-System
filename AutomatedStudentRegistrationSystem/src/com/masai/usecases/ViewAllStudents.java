package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.AdministratorDao;
import com.masai.dao.AdministratorDaoImpl;
import com.masai.exception.AdminException;
import com.masai.model.StudentDTO;

public class ViewAllStudents {

	public static void main(String[] args) {
		
	AdministratorDao adm= new AdministratorDaoImpl();
		
		try {
		List<StudentDTO> sv=	adm.viewAllStudent_Batch();
		sv.forEach(s->System.out.println(s));	
		
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}
}
