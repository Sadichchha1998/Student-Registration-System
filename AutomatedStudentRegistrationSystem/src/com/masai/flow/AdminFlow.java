package com.masai.flow;

import java.util.Scanner;

import com.masai.usecases.AddCourse;
import com.masai.usecases.AdminLogin;
import com.masai.usecases.AdminRegistration;
import com.masai.usecases.AllDetailsCourseAndSeats;
import com.masai.usecases.CreateBatch_ForCourse;
import com.masai.usecases.DeleteCourse;
import com.masai.usecases.InsertStudent;
import com.masai.usecases.SearchInformationCourse;
import com.masai.usecases.UpdateFees;
import com.masai.usecases.UpdateSeats;
import com.masai.usecases.UpdateStudentDetails;
import com.masai.utility.ConsoleColors;

public class AdminFlow {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(ConsoleColors.BLACK_BOLD);
		System.out.println("Welcome into Admin Panel");
		System.out.println(ConsoleColors.RESET);
		System.out.println(ConsoleColors.ANSI_CYAN);
		 while(true) {
			 Thread.sleep(100);
		System.out.println(" ==================================");
		 Thread.sleep(100);
		System.out.println("| Enter 1 for Register as Admin    |");
		 Thread.sleep(100);
		System.out.println("| Enter 2 for login as Admin       |");
		 Thread.sleep(100);
		System.out.println("| Enter 0 to Exit                  |");
		 Thread.sleep(100);
		System.out.println(" ==================================");
		
		System.out.println(ConsoleColors.BLUE);
	 Scanner sc= new Scanner(System.in);
	 
	 int res= sc.nextInt();
	
	 if(res==1) {
	
			boolean bl=	AdminRegistration.main(null);
		
			if(bl) {
				System.out.println("Registration Succesful");
				System.out.println("Please log in");
				 AdminFlow.main(null);
			}else {
				System.out.println("Please provide valid Data!");
				 AdminFlow.main(null);
			}
		 
		 
		 
		 
	 }else if(res==2) {
		 
		boolean b=AdminLogin.main(null);
		 if(b) {
			 afterAdminLogin();
			 
			 break;
		 }else {
			 System.out.println("Please provide valid Information for the login ");
			 AdminFlow.main(null);
		 }
		 
	
	 }else if(res==0) {
		 System.out.println("Thank You!");
		 return;
	 }
	 else {
		 System.out.println("Please Enter valid Option");
		 AdminFlow.main(null);
	 }
		
	 
	 
	 
	 
		
	}
	}
	
	
	public static void afterAdminLogin() throws InterruptedException {
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Welcome to Admin Panel");
		
		while(true) {
			System.out.println(ConsoleColors.ANSI_PURPLE);
			 Thread.sleep(100);
			System.out.println(" ===========================================");
			 Thread.sleep(100);
			System.out.println("|1 : For  Add Course                     |");
			 Thread.sleep(100);
			System.out.println("| 2 : For  Delete Course                  |");
			 Thread.sleep(100);
			System.out.println("|3: Fo Update fee of a Course         |");
			 Thread.sleep(100);
			System.out.println("|4 :For Update Seats in a Batch        |");
			 Thread.sleep(100);
			System.out.println("| 5: For Admit student in a course      |");
			 Thread.sleep(100);
			System.out.println("| 6: For create Batch                   |");
			 Thread.sleep(100);
			System.out.println("| 7 : For to Search Information of a Course |");
			 Thread.sleep(100);
			System.out.println("| 8: For  View all Details of all Batch  |");
			 Thread.sleep(100);
			System.out.println("|9: For to Exit                           |");
			 Thread.sleep(100);
			System.out.println("| 10: For to Back                          |");
			 Thread.sleep(100);
		    System.out.println(" ============================================");
		    System.out.println(ConsoleColors.RESET);
		    int opt= sc.nextInt();
		    
		    if(opt==1) {
		    	AddCourse.main(null);
		    }
		    else if(opt==2) {
            	DeleteCourse.main(null);
		    }
		    else   if(opt==3) {
	                 UpdateFees.main(null);
              }
		    else  if(opt==4) {
	UpdateSeats.main(null);
                               }
		    else   if(opt==5) {
	InsertStudent.main(null);
                          } 
		    else   if(opt==6) {
	CreateBatch_ForCourse.main(null);
                          }
		    else  if(opt==7) {
	SearchInformationCourse.main(null);
                          }
		    else  if(opt==8) {
	AllDetailsCourseAndSeats.main(null);
                            }
		    else  if(opt==9) {
		    	System.out.println("Thank You!");
	return;
                            }
		    else if(opt==10) {
		    	AdminFlow.main(null);
		    }else {
		    	System.out.println("Please Enetr valid Option");
		    }
		    
		}
		
	}
	
	
	
		}

