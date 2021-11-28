package com.greatlearning.model;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	public Employee(String firstName, String lastName, String department) {
		this.setFirstName( firstName);
		this.setLasName(lastName);
		this.setDepartment (department);
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasName() {
		return lastName;
	}
	public void setLasName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}


}
