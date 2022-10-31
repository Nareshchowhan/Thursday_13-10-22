package com.ThursdayAssaignment;
import java.util.*;

public class Swap {

	int a,b;
	void swap1(Swap obj)
	{
		int temp = obj.a;
		obj.a = obj.b;
		obj.b = temp;
	}
	
	void get() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter a & b value");
		a = sc.nextInt();
		b= sc.nextInt();
	}
	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Swap obj = new Swap();
		obj.get();
		obj.swap1(obj);
		System.out.println(obj.a + " "+ obj.b);

	}

}
