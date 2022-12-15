package com.masai.Model;

public class Batch {
	 private int B_id;
	private String B_name;
	private String Duration ;
	private int Seats;
	private int c_id;
	private String Division;
	public int getB_id() {
		return B_id;
	}
	public void setB_id(int b_id) {
		B_id = b_id;
	}
	public String getB_name() {
		return B_name;
	}
	public void setB_name(String b_name) {
		B_name = b_name;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public int getSeats() {
		return Seats;
	}
	public void setSeats(int seats) {
		Seats = seats;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getDivision() {
		return Division;
	}
	public void setDivision(String division) {
		Division = division;
	}
	public Batch(int b_id, String b_name, String duration, int seats, int c_id, String division) {
		super();
		B_id = b_id;
		B_name = b_name;
		Duration = duration;
		Seats = seats;
		this.c_id = c_id;
		Division = division;
	}
	@Override
	public String toString() {
		return "Batch [B_id=" + B_id + ", B_name=" + B_name + ", Duration=" + Duration + ", Seats=" + Seats + ", c_id="
				+ c_id + ", Division=" + Division + "]";
	}

}
