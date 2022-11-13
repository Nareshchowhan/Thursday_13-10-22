package com.shapes;

public class ShapeMain {
	public static void main(String[] args) {
		//Shape a = new Shape(Circle);
		Shape s = new Shape("Circle");
		Circle c = new Circle();
		c.draw(s);
		c.erase();

		}


}
