package com.masai.Model;

public class Course {
	 private int c_id;
	private String c_name;
	 private int Fee;
	 private int Seats;
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public int getFee() {
		return Fee;
	}
	public void setFee(int fee) {
		Fee = fee;
	}
	public int getSeats() {
		return Seats;
	}
	public void setSeats(int seats) {
		Seats = seats;
	}
	public Course(int c_id, String c_name, int fee, int seats) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		Fee = fee;
		Seats = seats;
	}
	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", c_name=" + c_name + ", Fee=" + Fee + ", Seats=" + Seats + "]";
	}
	 
}
