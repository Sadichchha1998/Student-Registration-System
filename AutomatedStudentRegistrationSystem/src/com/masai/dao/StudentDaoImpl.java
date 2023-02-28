package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.exception.StudentException;
import com.masai.model.InformationCourseDTO;
import com.masai.model.Student;
import com.masai.utility.utility;

public class StudentDaoImpl implements StudentDao {

	@Override
	public String updateDetails(int roll, String field, String newData) throws StudentException {

	String msg="Student Details  Not Updated ...: ";
		
	try (Connection conn=utility.provideconnetion()){
		
		 
	 PreparedStatement ps=	conn.prepareStatement("UPDATE students set "+field+"=? WHERE sroll = ?");
		
	ps.setString(1, newData);
		ps.setInt(2, roll);
		
	int rs=	ps.executeUpdate();
	
	if(rs>0) {
		msg="Updated Succesfully...:";
	}
	} catch (SQLException e) {
		// TODO: handle exception
	
		throw new StudentException(e.getMessage());
		
	}
	
	return msg;
	}

	
		


	@Override
	public String registration(Student s) throws StudentException {
		

		String msg="Student Not Registered";
		
		try (Connection conn=utility.provideconnetion()){
			
			PreparedStatement ps=	conn.prepareStatement("insert into students(semail,spassword,sname) values(?,?,?)");
				
			ps.setString(1, s.getEmail());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getName());
			
			
	       int	x=	ps.executeUpdate();
				
	       if(x>0) {

	    	 
	 	    			  msg="Registration Succesful";
	 	    		  }else {
	 	    			  msg="Some Registration eroor occure";
	 	    		  }
	    		    	
	    		    
	    		  
				
			} catch (SQLException e) {
				// TODO: handle exception
				
				throw new StudentException(e.getMessage());
		
			}
			
			
		
				 
			 
			 
		
		return msg;
		
	}


	
	@Override
	public String studentRegistration(Student s, int cid) throws StudentException {
		
		String msg="Student Not Registered  : ";
		
		try (Connection conn=utility.provideconnetion()){
			
			PreparedStatement ps=	conn.prepareStatement("insert into students(semail,spassword,sname) values(?,?,?)");
				
			ps.setString(1, s.getEmail());
			ps.setString(2, s.getPassword());
			ps.setString(3, s.getName());
			
			
	       int	x=	ps.executeUpdate();
				
	       if(x>0) {

	    	   PreparedStatement ps1= conn.prepareStatement("select * from courses where c_id=?");

	    	   ps1.setInt(1, cid);
	    	   ResultSet rs1= ps1.executeQuery();
	    	   
	    	   if(rs1.next()) {
	    		   
	    		   
	    		   PreparedStatement ps2= conn.prepareStatement("select * from students where semail=?");
	    		   
	    		   ps2.setString(1, s.getEmail());
	    		    ResultSet rs3= ps2.executeQuery();
	    		   
	    		    if(rs3.next()) {
	    		   

	 	    		   PreparedStatement ps3= conn.prepareStatement("insert into student_course(roll,course) values(?,?)");
	 	    		   
	 	    		   int mm= rs3.getInt("sroll");
	 	    		   
	 	    		   ps3.setInt(1,mm);
	 	    		  ps3.setInt(2,cid);
	    		    	
	 	    		  int done= ps3.executeUpdate();
	
	 	    		  if(done>0) {
	 	    			  msg="Registration Succesful";
	 	    		  }else {
	 	    			  msg="Some Registration eroor occure";
	 	    		  }
	    		    	
	    		    }
	    		   
	    		   
	    		   
	    	   }else {
	    		   msg="Course not found with this id";
	    	   }
	    	   
	       }
	    	   
	    	   
	    	   
	      
				
				
				
			} catch (SQLException e) {
				// TODO: handle exception
				
				throw new StudentException(e.getMessage());
		
			}
			
			
		
				 
			 
			 
		
		return msg;
	}


	@Override
	public List<InformationCourseDTO> detailsAllCourse() throws StudentException {
		
		List<InformationCourseDTO> list= new ArrayList<>();
		
		
		
		try (Connection conn=utility.provideconnetion()){
			

PreparedStatement ps=	conn.prepareStatement("select * from courses");
				
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
				
				PreparedStatement ps1=	conn.prepareStatement("select c.c_name,c.fee,b.bname,b.seats from batch b INNER JOIN courses c "
						+ "ON b.cId = c.c_id  ");
				
				
				
	      ResultSet rs2=ps1.executeQuery();
				
				
	      while(rs2.next()) {
	    	  
	    	  int seats = rs2.getInt("b.seats");
				String bname = rs2.getString("b.bname");
				String cname = rs2.getString("c.c_name");
				int fee = rs2.getInt("c.fee");
			
				InformationCourseDTO co= new InformationCourseDTO(cname, fee, bname, seats);
				
				
				list.add(co);
				
	    	  
	    	  
	    	  
	      }if(list.size()==0) {
	    	  throw new StudentException("Empty data");
	      }
	      
				
			}else {
				throw new StudentException("Invalid Id");
			}
		
			
			
			
			

		} catch (SQLException e) {
			// TODO: handle exception
		
			throw new StudentException(e.getMessage());
			
		}
		
		
		
		
		
		return list;
	}

	
	@Override
	public Student login(String username, String password) throws StudentException {

		Student std= new Student();

		try (Connection conn=utility.provideconnetion()){
			
		PreparedStatement ps=	conn.prepareStatement("Select * from students where semail=? and spassword =?");
		ps.setString(1,username);
		ps.setString(2, password);
		
		ResultSet rs=	ps.executeQuery();
			
	if(rs.next()) {
		
	 std= new Student(rs.getInt("sroll"),rs.getString("sname"),rs.getString("semail"),null);
		
		
	}else {
		throw new StudentException("Invalid Email or password");
	}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		throw new StudentException(e.getMessage());
		}
		
		
		return std;
		
	}

	
}
