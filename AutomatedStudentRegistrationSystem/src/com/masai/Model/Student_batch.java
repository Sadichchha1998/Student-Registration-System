package com.masai.Model;

public class Student_batch {
	 private int Roll_No;
	 private int C_id;
	 private int B_id ;
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {
		C_id = c_id;
	}
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public Student_batch(int roll_No, int c_id, int b_id) {
		super();
		Roll_No = roll_No;
		C_id = c_id;
		B_id = b_id;
	}
	@Override
	public String toString() {
		return "Student_batch [Roll_No=" + Roll_No + ", C_id=" + C_id + ", B_id=" + B_id + "]";
	}
	 
}
