package com.ThursdayAssaignment;

public class ClassCircle
{
	
	private float radius,center;
	 static  int count=0; 
	 
	 
	 ClassCircle(){
		 
		 System.out.println("constructor to initialize variables");
	 }
	 
	 ClassCircle(float radius,float center){
		 
		 this.radius = radius;
		 this.center = center;
		 count++;
		 
		 
	 }
	 

	public static void main(String[] args) {
		ClassCircle s1 = new ClassCircle(22.5f,25.6f);
		ClassCircle s2 = new ClassCircle(22.55f,25.86f);
		System.out.println("circle 1st center:"+ s1.center+"Radius"+" "+s1.radius);
		System.out.println("circle 2nd center:"+ s2.center+"Radius"+" "+s2.radius);
		System.out.println("no.of instance of circle is:"+ClassCircle.count);
		
	}

}
