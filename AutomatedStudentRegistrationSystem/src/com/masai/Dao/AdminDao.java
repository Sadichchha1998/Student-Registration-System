package com.masai.Dao;

import java.util.List;

import com.masai.Exception.AdminException;
import com.masai.Model.Admin;
import com.masai.Model.Batch;
import com.masai.Model.Course;
import com.masai.Model.CourseDTO;
import com.masai.Model.Student;
import com.masai.Model.StudentDTO;

public interface AdminDao {

String adminRegistration(Admin admin) throws AdminException;
	
	String addCourse(Course course) throws AdminException;
	
	String updateFee( int cid,int newFee) throws AdminException;
	
	String deleteCourse(int cid) throws AdminException;
	
	String addBatchToCourse(Batch batch) throws AdminException;
	
	List<CourseDTO> searchCourse(int cid) throws AdminException;
	
	String addStudentToBatch(int roll, int bid, int cid) throws AdminException;
	
	String updateSeatsOfBatch(int bid, int newSeats) throws AdminException;
	
	List<StudentDTO> showAllStudent() throws AdminException;
	
	Admin login(String username, String password) throws AdminException;
	
	List<Student> studentList() throws AdminException;
	
	List<Course> courseList() throws AdminException;
}
