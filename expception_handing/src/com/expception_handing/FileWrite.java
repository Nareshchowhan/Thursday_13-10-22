package com.expception_handing;

import java.io.FileOutputStream;

public class FileWrite {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fo = new FileOutputStream("d://output.txt");
			fo.write(65);
			fo.close();
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		System.out.println("successfully coded");

	}

}
