package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;

//@JsonFormat(shape = JsonFormat.Shape.ARRAY)
//@JsonPropertyOrder({ "employeeName", "timesheetEntries" })

public class Employee {
	 String employeeName;
	 List<Timesheet> timesheetEntries;
	 
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public List<Timesheet> getTimesheetEntries() {
		return timesheetEntries;
	}
	public void setTimesheetEntries(List<Timesheet> timesheetEntries) {
		this.timesheetEntries = timesheetEntries;
	}
	public Employee(String employeeName, List<Timesheet> timesheetEntries) {
		super();
		this.employeeName = employeeName;
		this.timesheetEntries = timesheetEntries;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", timesheetEntries=" + timesheetEntries + "]";
	}
	 
	 
	
	 
	 
//	public Employee(String employeeName, String date, int hoursWorked) {
//		super();
//		this.employeeName = employeeName;
//		this.date = date;
//		this.hoursWorked = hoursWorked;
//	}
//	public Employee() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	@Override
//	public String toString() {
//		return "Employee [employeeName=" + employeeName + ", date=" + date + ", hoursWorked=" + hoursWorked + "]";
//	}
//	public String getEmployeeName() {
//		return employeeName;
//	}
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//	public String getDate() {
//		return date;
//	}
//	public void setDate(String date) {
//		this.date = date;
//	}
//	public int getHoursWorked() {
//		return hoursWorked;
//	}
//	public void setHoursWorked(int hoursWorked) {
//		this.hoursWorked = hoursWorked;
//	}
//	
//	
	
}
