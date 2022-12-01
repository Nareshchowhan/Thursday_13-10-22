package multithread;

import multithead.Thread1;
import multithead.Thread2;

public class Thread1 extends Thread {
	
	public void run () {
		
		System.out.println("Thread1: Java is hot");
		System.out.println("Thread1:  aromatic ");
		System.out.println("Thread1:  invigorating");
		
		
		 
		
	}
}
	class Thread2 extends Thread {
		
		public void run() {
			System.out.println("Thread2: Java is hot");
			System.out.println("Thread2:  aromatic ");
			System.out.println("Thread2: invigorating");
			
			
		}
	}
	
	class Thread3 extends Thread{
		public void run () {
			System.out.println("Thread3");
			
			try{
				
				sleep(1000);
				
			}catch(Exception e) {
				System.out.println(e);
				
				System.out.println("its Running");
			}
		}
		
	

	public static void main(String[] args) {
		Thread obj1 = new Thread1();
		obj1.start();
		Thread obj2 = new Thread2();
		obj2.start();
		

	}

	}
	
