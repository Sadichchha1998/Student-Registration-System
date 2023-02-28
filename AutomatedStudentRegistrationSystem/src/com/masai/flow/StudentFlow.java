package com.masai.flow;

import java.util.Scanner;

import com.masai.main.Main;
import com.masai.usecases.AddCourse;
import com.masai.usecases.AdminRegistration;
import com.masai.usecases.DeleteCourse;
import com.masai.usecases.RegisterStudentIntoCourse;
import com.masai.usecases.Registerstudent;
import com.masai.usecases.SearchInformationCourse;
import com.masai.usecases.StudentLogin;
import com.masai.usecases.UpdateFees;
import com.masai.usecases.UpdateSeats;
import com.masai.usecases.UpdateStudentDetails;
import com.masai.utility.ConsoleColors;

public class StudentFlow {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ConsoleColors.BLACK_BOLD);
		System.out.println("Welcome into  Student Panel");
		System.out.println(ConsoleColors.RESET);
		
		 while(true) {
		
			 System.out.println(ConsoleColors.ANSI_PURPLE);
		System.out.println(" ==================================");
		System.out.println("| 1: for Register as Student  |");
		System.out.println("| 2: for login as Student     |");
		System.out.println("| 0:to Exit                  |");
		System.out.println(" ==================================");
	System.out.println(ConsoleColors.RESET);
	 Scanner sc= new Scanner(System.in);
	 
	 int reslt= sc.nextInt();
	
	 if(reslt==1) {
	
			boolean b1=	Registerstudent.main(null);
		
			if(b1) {
				System.out.println("Registration Succesfull...");
				System.out.println("Please log in first ...");
				 StudentFlow.main(null);
			}else {
				System.out.println("Please give Correct Info!");
				StudentFlow.main(null);
			}
		
		
	}else if(reslt==2) {
		boolean b2=	StudentLogin.main(null);
		if(b2) {
			
			stu();
			
			
		}else {
			
			break;
		}
	}else if(reslt==0){
		System.out.println("Thanks");
	
		break;
	}else{
		System.out.println("Please provide valid option");
		StudentFlow.main(null);
	}
	}
	
}
	
	public static void stu() {
		

	while(true) {
		System.out.println(ConsoleColors.ANSI_PURPLE);
		System.out.println(" ===========================================");
		System.out.println("| 1: For update your Details            |");
		System.out.println("|2:For to see Details of a Course        |");
		System.out.println("|3:For to Register yourself in a course  |");
		System.out.println("|4:For to Exist                          |");
		System.out.println("|===========================================|");
		System.out.println(ConsoleColors.ANSI_PURPLE);
		Scanner sc= new Scanner(System.in);
		
		   int opt= sc.nextInt();
		    
		    if(opt==1) {
		    	UpdateStudentDetails.main(null);
		    }
		    else if(opt==2) {
            	SearchInformationCourse.main(null);
		    }
		    else   if(opt==3) {
	                 RegisterStudentIntoCourse.main(null);
              }
		    else  if(opt==4) {
	
		break;
		
		    
		
	}
	}
	
	
}
}
