package com.cube;
import java.util.*;

public class NameOfMonth {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		
	System.out.println("Enter the month");
	month = sc.nextInt();
	sc.close();
	
	switch (month) {
	
	case 1: System.out.println("Januvary");
	  break;
	case 2: System.out.println("february");
	  break;
	case 3: System.out.println("March");
	  break;
	case 4: System.out.println("april");
	  break;
	case 5: System.out.println("may");
	  break;
	case 6: System.out.println("june");
	  break;
	case 7: System.out.println("July");
	  break;
	case 8: System.out.println("augest");
	  break;
	case 9: System.out.println("september");
	  break;
	case 10: System.out.println("october");
	  break;
	case 11: System.out.println("november");
	  break;
	case 12: System.out.println("december");
	  break;
	  
	 default:System.out.println("Given month is invaild");
	 break;
	 
	
	}
		

	}

}
