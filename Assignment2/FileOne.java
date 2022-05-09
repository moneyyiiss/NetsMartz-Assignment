//1. Write a program to give the example for method overriding concepts.
package java_Project;

public class FileOne{
	public static void main(String args[]) {
		 Desktop obj = new Desktop();
		 obj.process();
	}
}

class Folder{  
	  void process(){
		  System.out.println("File transfer ");
	  }  
}


class Desktop extends Folder{
	  void process(){
		  System.out.println("File is transfering");
	  }
} 