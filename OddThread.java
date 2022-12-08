package com.oddeven;

public class OddThread extends Thread {

	public void run() {
		System.out.println("The odd NUmbers are:");
		
		int n=50;
		for(int i=0; i<=n; i++) {
			if( i%2 !=0) {
				System.out.println(" "+ i);
				
			}
			
		}
		
	}
}
