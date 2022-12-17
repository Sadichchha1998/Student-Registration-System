package com.masai.Dao;

import java.util.List;

import com.masai.Exception.StudentException;
import com.masai.Model.CoursesDTO;
import com.masai.Model.Student;

public interface StudentDao {
	
	
	String studentRegistration(Student student, int cid) throws StudentException;
	
String updateDetails(int roll, String field, String newData) throws StudentException;
	
	List<CoursesDTO> showAllCourseDetails() throws StudentException;
	
	Student login(String username, String password) throws StudentException;
	

}
