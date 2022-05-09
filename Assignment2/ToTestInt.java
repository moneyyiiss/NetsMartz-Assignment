//6. Write a program to create interface named test. In this interface the member function is square. Implement this interface in arithmetic class. Create one new class called ToTestInt in this class use the object of arithmetic class.
package java_Project;

interface Test {
	 void square();
}

class Arithmetic implements Test{
	public void square(){
		System.out.println("this is square method");
	}
}
class ToTestInt extends Arithmetic{
	public static void main(String args[]) {
	      Arithmetic a = new Arithmetic();
	      a.square();
	     
	   }
}