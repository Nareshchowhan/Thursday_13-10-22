package com.inhertances;

import com.inhertances.Member.Employee;
import com.inhertances.Member.Employee.Manger;

class Member
{
	
	String  name;
	String age;
	long phonenumber;
	String address;
	double salary;
	
Member(String name, String age, long phonenumber, String address, double salary)
{
	this.age = age;
	this.phonenumber = phonenumber;
	this.address = address;
	this.salary = salary;
	
}


void printsalary() {
	
	System.out.println("print the salary");
}


class Employee extends Member 
{
   
	String specialization;
	String department;

	Employee(String name, String age, long phonenumber, String address, double salary, String depart, String spe)
	
	{
		
		super (name,age,phonenumber,address,salary);
	
		specialization = spe;
		department = depart;
	

}
	public void printDetails()
	{
		System.out.println(name + age + phonenumber + address + salary + department + specialization);
	}
	
class Manger extends Member {
	
	String department;
	String specialization;
	
	Manger(String name, String age, long phonenumber, String address, double salary, String depart, String spe)
	{
		
		super (name,age,phonenumber,address,salary);
		
		department = depart;
		specialization = spe;
	}
	
	
	public void printDetails()
	{
		System.out.println(name + age + phonenumber + address + salary + department + specialization);
	}
}



public class EmpolyeesData {
	
	
	public static void main(String[] args) {
		Employee e = new Employee ("Naresh",25,987654321,"Hyderabad",50000,"SOFTWARE", IT);
		e.printDetails();
		e.printsalary();
		
		Manger m = new Manger ("Naresh",25,987654321,"Hyderabad",50000,"SOFTWARE", IT);
		m.printsalary();
		m.printDetails();
	}
		
		    
}