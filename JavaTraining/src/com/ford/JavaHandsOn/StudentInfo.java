package com.ford.JavaHandsOn;

import java.util.Scanner;

//Encapsulation

class Student{
	private int id;
	private String name;
	private String branch;
	
	//Setter methods to access properties
	public void setId(int id) {
		if(id<0) {
			throw new RuntimeException("Id is wrong");
		}
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setBranch(String branch) {
		this.branch=branch;
	}
	
	//getter methods to display properties
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getBranch() {
		return this.branch;
	}
	
}
public class StudentInfo {
	public static void main(String[] args) {
		Student s1=new Student();
		Scanner sc=new Scanner(System.in);
		
		int Id=sc.nextInt();
		String Name=sc.next();
		String Branch=sc.next();
		s1.setId(Id);
		s1.setName(Name);
		s1.setBranch(Branch);
		
		System.out.print(s1.getId()+" "+s1.getName()+" "+s1.getBranch());
	}
}
