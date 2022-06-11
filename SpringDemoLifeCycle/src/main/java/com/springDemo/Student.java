package com.springDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	String name;
	int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}
	@Autowired
	public void setName(String name) {
		this.name = name;
	}
	
	public void startBean() {
		System.out.println("Execuated at the time of the bean initialization");
	}
	
	public void stopBean() {
		System.out.println("Execuated at the destruction of the bean initialization");
	}
	
	public void displayInfo() {
		System.out.println("Hello, " + name);
		System.out.println("Roll No " + rollno);
	}
}
