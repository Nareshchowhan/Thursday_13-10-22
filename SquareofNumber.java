//finding the square of given number

package com.square;

import java.util.Scanner;

class SquareofNumber{
	
	void squarecheck(int a) throws OutofRangeException{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n1=sc.nextInt();
		
		
		if(n1>10 && n1<50) 
			
			throw new OutofRangeException("out of Exception");
			
			else 
				
				throw new OutofRangeException("Square of the number"+" "+n1*n1);
			
		
		
		
		
	}
	
	
	public static void main (String args []) {
		SquareofNumber s1 = new SquareofNumber();
		try {
			
			s1.squarecheck(1);
		}catch(Exception e) {
			System.out.println(e);
			
			
		}
		
		
		
	}
}

	
	
	

	