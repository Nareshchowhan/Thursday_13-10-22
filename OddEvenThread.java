package com.oddeven;

public class OddEvenThread {

	public static void main(String[] args) {
		EvenThread et= new EvenThread();
		OddThread ot = new OddThread();
		
		et.start();
		ot.start();
	}

}
