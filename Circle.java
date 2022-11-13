package com.shapes;

public class Circle {
	public void draw(Shape s)
	{
		System.out.println("The shape drawn is : " + s.getShape() );
	}
	public void erase()
	{
		System.out.println("The drawn shape is erased");
	}
	
	public static void main(String args[])
	{
		Shape s = new Shape("Circle");
		Circle c = new Circle();
		c.draw(s);
		c.erase();
	}

}
