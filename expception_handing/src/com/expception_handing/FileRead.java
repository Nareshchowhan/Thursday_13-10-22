package com.expception_handing;

import java.io.FileInputStream;


public class FileRead {
	static public void main (String args []) {
		try
		{
		 FileInputStream fi = new FileInputStream("d://output.txt");	
		 int  i =0;
		 while((i=fi.read()) != -1) {
			 
			 System.out.println((char)i);
		 }
		 fi.close();
			
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
		
		
	}

}
