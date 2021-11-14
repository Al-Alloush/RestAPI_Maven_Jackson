package com.dachser.Entity;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private boolean actice;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public boolean isActice() {
		return actice;
	}
	public void setActice(boolean actice) {
		this.actice = actice;
	}
	

}
