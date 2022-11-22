
//Checking the weight of the product above 100
package com.product;

import java.util.Scanner;

public class Products {
	void productchecking(int weight) throws Exception{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the Weight of product");
		int n = sc.nextInt();
		
		if(n<100) 
			
			throw new MyException("invalid Weight");
			else 
				throw(new MyException("weight of the product is"+" "+n));
			
		
		
	}

	public static void main(String[] args) {
		Products p = new Products();
		try {
			
			p.productchecking(1);
		}catch(Exception e) {
			
			System.out.println(e);
		}
		

	}

}
