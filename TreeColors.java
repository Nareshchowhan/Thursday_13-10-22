package com.colors;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeColors {

	public static void main(String[] args) {
		
		// adding color to treeSet
		TreeSet<String> ts = new TreeSet<>();
		ts.add("Red");
		ts.add("Blue");
		ts.add("Green");
		ts.add("Yellow");
		
		
	// print the Elements
		
		System.out.println("The added colors are"+ts);
		
		
		//adding second color to treeSet
		TreeSet<String> ts1 = new TreeSet<>();
		ts1.add("Light Red");
		ts1.add("Light Blue");
		ts1.add("Light Green");
		ts1.add("Light Yellow");
		
		//printing the Elements
		System.out.println("The second added color are");
		ts.addAll(ts1);
		
		Iterator<String> itr = ts.iterator();
		while( itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		//Reversing a tree 
		System.out.println("Reversing the set "+ts.descendingSet());
		
		// comparing two sets
		boolean b1 = ts.equals(itr);
		System.out.println(b1);
		
		// get the first and last Elements in treeSet
		
		System.out.println("the first Element is "+ts.pollFirst());
		
		// last
		System.out.println("the first Element is "+ts.pollLast());
		
		
		
		
		
		
		
		
		
		
				

	}

}
