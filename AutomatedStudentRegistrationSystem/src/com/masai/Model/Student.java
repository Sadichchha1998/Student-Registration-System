package com.masai.Model;

public class Student {


			  private int Roll_No;
			private String First_name;
			private String Last_name;
			private String Email;
			private String Mobile_No;
			private String City;
			private String Gender;
			public int getRoll_No() {
				return Roll_No;
			}
			public void setRoll_No(int roll_No) {
				Roll_No = roll_No;
			}
			public String getFirst_name() {
				return First_name;
			}
			public void setFirst_name(String first_name) {
				First_name = first_name;
			}
			public String getLast_name() {
				return Last_name;
			}
			public void setLast_name(String last_name) {
				Last_name = last_name;
			}
			public String getEmail() {
				return Email;
			}
			public void setEmail(String email) {
				Email = email;
			}
			public String getMobile_No() {
				return Mobile_No;
			}
			public void setMobile_No(String mobile_No) {
				Mobile_No = mobile_No;
			}
			public String getCity() {
				return City;
			}
			public void setCity(String city) {
				City = city;
			}
			public String getGender() {
				return Gender;
			}
			public void setGender(String gender) {
				Gender = gender;
			}
			public Student(int roll_No, String first_name, String last_name, String email, String mobile_No,
					String city, String gender) {
				super();
				Roll_No = roll_No;
				First_name = first_name;
				Last_name = last_name;
				Email = email;
				Mobile_No = mobile_No;
				City = city;
				Gender = gender;
			}
			@Override
			public String toString() {
				return "Student [Roll_No=" + Roll_No + ", First_name=" + First_name + ", Last_name=" + Last_name
						+ ", Email=" + Email + ", Mobile_No=" + Mobile_No + ", City=" + City + ", Gender=" + Gender
						+ "]";
			}
			
			
}
