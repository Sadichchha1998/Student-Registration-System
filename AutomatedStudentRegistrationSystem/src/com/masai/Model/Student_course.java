package com.masai.Model;

public class Student_course {
	private int c_id;
	private int Roll_No;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public Student_course(int c_id, int roll_No) {
		super();
		this.c_id = c_id;
		Roll_No = roll_No;
	}
	@Override
	public String toString() {
		return "Student_course [c_id=" + c_id + ", Roll_No=" + Roll_No + "]";
	}
	
}
