package com.masai.usecases;

import java.util.List;

import com.masai.dao.StudentDao;
import com.masai.dao.StudentDaoImpl;
import com.masai.exception.StudentException;
import com.masai.model.InformationCourseDTO;

public class AllDetailsCourseAndSeats {

	
	public static void main(String[] args) {
		System.out.println("Get all details avaliable here ");
		
		StudentDao sdt= new StudentDaoImpl();
		
		try {
		List<InformationCourseDTO> lmt=	sdt.detailsAllCourse();
		
		lmt.forEach(s->System.out.println(s));
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
