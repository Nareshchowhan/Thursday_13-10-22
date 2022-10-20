package com.thursday2010;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int Original[][] = {{1,2,3},{4,5,6}, {7,8,9} };
		
		for(int i=0; i<=2;i++) {
			for(int j=0; j<=2; j++) {
				
				System.out.println( Original [i][j]+" ");
				System.out.println();
				
			}
			
		}
		for(int i=0; i<=2;i++) {
			for(int j=0; j<=2; j++) {
				
				System.out.println( Original [j][i]+" ");
				System.out.println();
				
			}
			
		}
				
	
	}
}
