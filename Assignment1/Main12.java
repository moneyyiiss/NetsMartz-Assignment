// 12. Write a program to create a class named shape. In this class we have three sub classes circle, triangle and square each class has two member function named draw () and erase (). Create these using polymorphism concepts.

public class Main12{
	public static void main(String args[]) {
		Circle c = new Circle();
		c.draw();
		c.erase();
		c= new Triangle();
		c.draw();
		c.erase();
		c = new Square();
		c.draw();
		c.erase();
	}
}
class Circle{
	void draw() {
		System.out.println("Circle draw");
	}
	void erase() {
		System.out.println("Circle erase");
	}
}
class Triangle extends Circle{
	void draw() {
		System.out.println("Triangle draw");
	}
	void erase() {
		System.out.println("Triangle erase");
	}
}
class Square extends Triangle{
	void draw() {
		System.out.println("Square draw");
	}
	void erase() {
		System.out.println("Square erase");
	}
}
