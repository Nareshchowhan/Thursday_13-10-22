package com.students;

import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentCourse {

	public static void main(String[] args) {
		//add TeeMap to Add elements 
				TreeMap<Integer,String> tc=new TreeMap<>();
				tc.put(101,"Java");
				tc.put(102,"javaScript");
				
				System.out.println("The tree Elements are"+tc);
				
				
				//adding a Tree Map content to another Tree Map
				TreeMap<Integer,String> tc1=new TreeMap<>();
	            tc1.put(201,"Mysql");
				tc1.put(200, "React.js");
				tc.putAll(tc1);
				
				System.out.println("-------------------------------------");
				for(Entry<Integer, String> e : tc.entrySet())
				{
					System.out.println(e.getValue()+" "+e.getKey());
					
				}
				
				//To search a key in a Tree Map.
				System.out.println(tc.containsKey(101));
				
				//To search a value in a Tree Map
				System.out.println(tc.containsValue("Java"));
				
				//To get a reverse order view of the keys contained in a given map
				
				System.out.println(tc.descendingKeySet());
				
				//To get the least key-value in a map.
				System.out.println("least entry in map"+tc.firstEntry());
				
				//To get the Greatest key-value in a map.
				System.out.println("greates entry in map"+tc.lastEntry());
				
				//to remove and get a key-value mapping associated with the least key in a map.
				System.out.println(tc.pollFirstEntry());
				
				//to remove and get a key-value mapping associated with the greatest key in this map
				System.out.println(tc.pollLastEntry());
				
				System.out.println("After Removing Greatest and Least element");
				
				System.out.println(tc);
				
			

			}


	}


