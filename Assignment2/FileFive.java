//5. Write a program to give example for multiple inheritance in Java.
package java_Project;
public class FileFive {
	public static void main(String args[]) {
	      Animals a = new Animals();
	      a.eat();
	      a.travel();
	   }
}

interface AnimalEat {
	 void eat();
}

interface AnimalTravel {
	 void travel();
}

class Animals implements AnimalEat, AnimalTravel {
	 public void eat() {
	      System.out.println("Animal is eating");
	 }
	 public void travel() {
	      System.out.println("Animal is travelling");
	 }
}

