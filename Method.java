package com.inhertances;

class Rectangle 
{
	
	int length;
	int breadth;
	
	Rectangle (int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}


void area () 
{
	double area = length* breadth;
	System.out.println("area of the Rectangle is" + " "+ area);
	
	
}

void perimiter () {
	
	double perimiter = 2* (length * breadth);
	System.out.println("perimiter of reactangle " + " "+ perimiter);
}
}

class Square extends Rectangle {
	
	int side;
	
	Square(int side){
		
		this.side = side;
	}
		
	 void area () {
		 
		 double area = side*side;
		 System.out.println("area of the Square is" + " "+ area);
			
	 }
	
	 void perimiter () {
		 
		 double perimiter = 4 * side;
		 System.out.println("perimiter of the Square is" + " "+ perimiter);
	 }
	
}



public class Method {

	public static void main(String[] args) {
		Rectangle r = new Rectangle (5,5);
		r.area();
		r.perimiter();
		Square s1= new Square(10);
		s1.area();
		s1.perimiter();
		
	}

}
