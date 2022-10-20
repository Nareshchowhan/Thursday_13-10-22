package com.thursday2010;
import java.util.Arrays;
public class EqualityOfArray {



	public static void main(String[] args) {
		 int [] array1 = new int [] {1,2,3,4,5,6};
		 int [] array2 = new int [] {1,2,3,4,5,6,7};
	
		 if(Arrays.equals(array1, array2)) {
			 System.out.println("Array are equal");
		 }
		 else 
		 {
			 System.out.println("Array are not equal");
		 }
		 
		 }
}

