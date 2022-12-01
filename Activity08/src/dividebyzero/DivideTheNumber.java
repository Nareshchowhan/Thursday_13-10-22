package dividebyzero;

import java.util.Scanner;

public class DivideTheNumber {
	
	public static void dividebyzero() {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the first number");
		int num1 = sc.nextInt();
		System.out.println("enter the second element");
		double num2 = sc.nextInt();
	   double 	result = num1/num2;
	   
	   if(num2==0) {
		   
		   throw new ArithmeticException("this is arthimatic Exception");
		   
		  
	   }
	   
	   else {
		   System.out.println("print the result" +" "+ result);
	   }
		
		
		
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		dividebyzero();  // static methods can be accessed without creating object of the class

	}

}
