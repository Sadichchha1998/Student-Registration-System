package com.masai.usecases;

import java.util.List;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.InformationCourseDTO;

public class AllDetailsCourseAndSeats {

	
	public static void main(String[] args) {
		System.out.println("Get all details present ");
		
		StudentDao s= new StudentDaoImpl();
		
		try {
		List<InformationCourseDTO> lm=	s.detailsAllCourse();
		
		lm.forEach(ss->System.out.println(ss));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
