package com.ThursdayAssaignment;
import java.util.Scanner;

public class Students1 {
static	int count=0;
	int id;
String name,course,branch;

Students1(){
	count++;
}

Students1(String name, String course, String branch){
	
	this.name = name;
	this.course = course;
	this.branch = branch;
	
}

void enterinfo() {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Student name:");
	name = sc.next();
	System.out.println("Enter the course name:");
	course = sc.next();
	System.out.println("Enter the branch name:");
	branch = sc.next();
	
};

   void displayinfo() {
	   
	   System.out.println("Name of the Student"+" "+name);
	   System.out.println("Name of the Student"+" "+course);
	   System.out.println("Name of the Student"+" "+branch);
	   
	
	  
	   
   }
   
   static int getCount() {
		 
		 return Students1.count;
	 }
	  
   
   
   

	
	

	
	public static void main(String[] args) {
		
		Students1 obj1 = new Students1();
		Students1 obj2 = new Students1();
		System.out.println("Student1");
		obj1.enterinfo();
		System.out.println("Student2");
		obj2.enterinfo();
		System.out.println("Display the information");
		System.out.println("Student1");
		obj1.displayinfo();
		System.out.println("Student2");
		obj2.displayinfo();
		System.out.println("number of the students enrolled in the  university"+Students1.getCount());
		
		
	
		
		
	}
		}  
	





