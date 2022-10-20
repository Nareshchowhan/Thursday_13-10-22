package com.thursday2010;

public class ReverseArray {  
    public static void main(String[] args)
    { 
    	
        //Initialize array  
        int [] arr = new int [] {10, 20, 30, 40, 50,60};  
        
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        System.out.println();  
        System.out.println("Array in reverse order: "); 
        
        //Loop through the array in reverse order  
        
        
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
      
        
        }  
        
        
    }  
}  