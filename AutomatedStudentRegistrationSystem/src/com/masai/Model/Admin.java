package com.masai.Model;

public class Admin {

	
	 private int Admin_id;
	 private String A_name;
	 private String A_user;
	 private String  A_password;
	public int getAdmin_id() {
		return Admin_id;
	}
	public void setAdmin_id(int admin_id) {
		Admin_id = admin_id;
	}
	public String getA_name() {
		return A_name;
	}
	public void setA_name(String a_name) {
		A_name = a_name;
	}
	public String getA_user() {
		return A_user;
	}
	public void setA_user(String a_user) {
		A_user = a_user;
	}
	public String getA_password() {
		return A_password;
	}
	public void setA_password(String a_password) {
		A_password = a_password;
	}
	public Admin(int admin_id, String a_name, String a_user, String a_password) {
		super();
		Admin_id = admin_id;
		A_name = a_name;
		A_user = a_user;
		A_password = a_password;
	}
	@Override
	public String toString() {
		return "Admin [Admin_id=" + Admin_id + ", A_name=" + A_name + ", A_user=" + A_user + ", A_password="
				+ A_password + "]";
	}
	
	
	
	
}
