package com.example.demo.model;


public class Timesheet {
	String date;
    Integer hoursWorked;
	public Timesheet(String date, int hoursWorked) {
		super();
		this.date = date;
		this.hoursWorked = hoursWorked;
	}
	public Timesheet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	@Override
	public String toString() {
		return "Timesheet [date=" + date + ", hoursWorked=" + hoursWorked + "]";
	}
	
	
	

}
