//3. Write a program to give a simple example for abstract class.
package java_Project;

abstract class Movie{  
	  abstract void transfer();  
} 

public class FileThree extends Movie {
	void transfer(){
		System.out.println("Transfering");
		}
	public static void main(String args[]){  
		 Movie obj = new FileThree();  
		 obj.transfer();  
	}  
}
 
	