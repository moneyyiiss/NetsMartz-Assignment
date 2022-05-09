//7. Create an outer class with a function display, again create another class inside the outer class named inner with a function called display and call the two functions in the main class.
package java_Project;

public class FileSeven {
	public static void main(String[] args) {
		Outer obj = new Outer();
		Outer.Inner inn = obj.new Inner();
		obj.display();
		inn.display();
	}
}
class Outer{
	void display() {
		System.out.println("this is Outer class method");
	}
	class Inner{
		void display() {
			System.out.println("this is inner class method");
		}
	}
}
