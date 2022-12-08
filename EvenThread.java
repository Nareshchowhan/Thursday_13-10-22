package com.oddeven;

public class EvenThread extends Thread {
	
	public void run() {
		System.out.println("The Even NUmbers are:");
		
		int n=50;
		for(int i=0; i<=n; i++) {
			if( i%2==0) {
				System.out.println(" "+ i);
				
			}
			
		}
		
	}
	
	

}
