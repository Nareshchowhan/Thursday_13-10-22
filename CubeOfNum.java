package com.cube;
import java.util.*;
public class CubeOfNum {
	static public void main (String args [] ){
		
		int n,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		n = sc.nextInt();
		sc.close();
		for(int i=0; i<=n; i++) {
		
		result = i*i*i;
		
		
		System.out.println(result);
		
		}
	
		
		
		
	}

}


