package masai.flow.com;

import java.util.Scanner;

import com.masai.Usecases.AdminMenu;
import com.masai.Usecases.StudentMenu;
import com.masai.util.ConsoleColors;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void studentAuth() {
		
		System.out.println(ConsoleColors.CYAN_BOLD+"PLEASE SELECT FROM THE FOLLOWING OPTIONS"+ConsoleColors.RESET);
		System.out.println("| ===========================================|");
		System.out.println("| 1.Student Login                            |");
		System.out.println("| 2.New Student Registration                 |");
		System.out.println("| 3. Shows All  Seats  and Courses available |");
		System.out.println("| ===========================================|");
		//System.out.println("\n\n");
		System.out.println("0. Go Back");
		System.out.println("99. Exit The Application");
		
		try {
			
			int option = sc.nextInt();
			StudentMenu student = new StudentMenu();
			
			switch(option){
				case 0 : menu();
					break;
				case 2 : student.register();
				System.out.println("----------------------------------------");
						studentAuth();
					break;
				case 1 : int check = student.login();
				System.out.println("----------------------------------------");
					if(check != 0) studentActivity(check);
					else studentAuth();
					break;
				case 3 : student.showAllCourse();
				System.out.println("----------------------------------------");
				studentAuth();
					break;
				case 99 :
					System.out.println(ConsoleColors.CYAN_BOLD+"Thank you so much  for using Application"+ConsoleColors.ANSI_YELLOW);
					break;
				default : 
					System.out.println(ConsoleColors.CYAN_BOLD+"Invalid Selection/ Not Defined "+ConsoleColors.ANSI_RED);
					System.out.println("----------------------------------------");
					studentAuth();
			}
			
		}catch(Exception e) {
			
			System.out.println(ConsoleColors.CYAN_BOLD+"Invalid Selection"+ConsoleColors.BANANA_YELLOW_BACKGROUND);
			System.out.println("----------------------------------------");
			menu();
		}

	}
	
	public static void studentActivity(int roll) {
		
		System.out.println("PLEASE SELECT FROM THE FOLLOWING OPTIONS ");
		System.out.println("1. Update Details ");
		System.out.println("\n\n");
		System.out.println("0. Go Back");
		System.out.println("99. Exit the Application");
		
		try {
		
			String opt = sc.next();
			int option = Integer.parseInt(opt);
			
			StudentMenu student = new StudentMenu();
			
			switch(option) {
				case 0 : studentAuth();
					break;
				case 1 : student.updateDetail(roll);
				System.out.println("----------------------------------------");
					studentActivity(roll);
					break;
				case 99 :
					System.out.println("Thank you  so much for using Application");
					break;
				default : 
					System.out.println("Invalid Selection ");
					System.out.println("----------------------------------------");
					studentActivity(roll);
			}
		}catch(Exception e) {
			System.out.println("Invalid Selection");
			System.out.println("----------------------------------------");
			menu();
		}
	}
	
	public static void adminAuth() {
		
		System.out.println( ConsoleColors.BLUE_ITALIC+"PLEASE SELECT FROM THE FOLLOWING OPTIONS "+ConsoleColors.FOREST_GREEN);
		System.out.println( ConsoleColors.CYAN_BOLD+"1. New Admin Registration"+ConsoleColors.ANSI_BLACK);
		System.out.println(ConsoleColors.CYAN_BOLD+"2. Admin Login"+ConsoleColors.ANSI_RED);
		System.out.println("\n\n");
		System.out.println("0. Go Back");
		System.out.println("99. Exit The Application");
		
		AdminMenu am = new AdminMenu();
		
		try {
			int option = sc.nextInt();
			switch(option) {
			case 0: menu();
				break;
			case 1: am.register();
				adminAuth();
				break;
			case 2: int check = am.login();
				if(check == 1) adminActivity();
				else adminAuth();
				break;
			case 99 :
				System.out.println("Thank you for using Application");
				break;
			default : 
				System.out.println("Invalid Selection ");
				adminAuth();
			}
			
		}catch(Exception e) {
			System.out.println("Invalid Selection !");
			System.out.println("----------------------------------------");
			adminAuth();
		}
	}
	
	public static void adminActivity() {
		
		System.out.println("PLEASE SELECT FROM THE FOLLOWING OPTIONS ");
		
		System.out.println("1. Add new Course");
		System.out.println("2. Update Fees of Course");
		System.out.println(ConsoleColors.ANSI_BLUE+"3. Delete Course");
		System.out.println("4. Search Course");
		System.out.println("5. Create Batch");
		System.out.println("6. Add Student in Batch");
		System.out.println("7. Update Seats in Batch");
		System.out.println("8. View Student in Batch");
		System.out.println("9. View All Student List");
		System.out.println("10. View All Course List");
		System.out.println("\n\n");
		System.out.println("0. Go Back");
		System.out.println("99. Exit The Application");
		
		AdminMenu am = new AdminMenu();
		try {
			
			int option = sc.nextInt();
			switch(option) {
				case 0 : adminAuth();
					break;
				case 1 : am.addCourse();
					adminActivity();
					break;
				case 2:
					am.updateFee();
					adminActivity();
					break;
				case 3:
					am.deleteCourse();
					adminActivity();
					break;
				case 4:am.searchCourse(); adminActivity(); break;
				case 5:am.addBatchToCourse(); adminActivity(); break;
				case 6:am.addStudentToBatch(); adminActivity(); break;
				case 7:am.updateSeats(); adminActivity(); break;
				case 8:am.allStudentInBatch(); adminActivity(); break;
				case 9:am.studentList(); adminActivity(); break;
				case 10:am.showCourse(); adminActivity(); break;
				case 99:
					System.out.println("Thank you for using Application");
					break;
				default:System.out.println("Invalid Selection !");
					adminActivity();
			}
			
			
		}catch(Exception e) {
			System.out.println("Invalid Exception");
			System.out.println("----------------------------------------");
			adminActivity();
		}
		
	}
	
	public static void menu() {
		
		System.out.println("PLEASE SELECT FROM THE OPTIONS ");
		System.out.println("1. Student ");
		System.out.println("2. Admin ");
		System.out.println("\n\n");
		System.out.println("99. Exit the Application");
		
		
		try {
			
			String opt = sc.next();
			int option = Integer.parseInt(opt);	
		
			if(option == 1) {
				System.out.println("----------------------------------------");
				studentAuth();
			}else if(option == 2) {
				System.out.println("----------------------------------------");
				adminAuth();
			}else if(option == 99) {
				System.out.println("Thank You for using Application.");
			}else {
				System.out.println("Invalid Selection : Please try again");
				menu();
			}
		
		
		}catch(Exception e) {
			System.out.println("Invalid Entry ");
			System.out.println("----------------------------------------");
			menu();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("WELCOME TO STUDENT REGISTRATION PORTAL ");
		System.out.println("--------------------------------------");
		
		menu();
	}


}
