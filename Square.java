package com.shapes;

public class Square {

	public void draw(Shape s)
	{
		System.out.println("The drawn shape is: " + s.getShape());
	}
	public void erase()
	{
		System.out.println("The shape is erased");
	}	

	public static void main(String args[])
	{
		Shape s = new Shape("Square");
		Square sq = new Square();
		sq.draw(s);
		sq.erase();
	}
}
