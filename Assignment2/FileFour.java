//4. Write a program to create interface A in this interface we have two method meth1 and meth2. Implements this interface in another class named MyClass.
package java_Project;
public class FileFour {
	public static void main(String args[]) {
		MyClass obj = new MyClass();  
		obj.meth1(); 
		obj.meth2();
	}
}


interface A{  
void meth1();
void meth2();
} 

class MyClass implements A{  
	public void meth1(){
		System.out.println("This is meth 1 ");
	}
	public void meth2(){
		System.out.println("This is meth 2");
	}


}
