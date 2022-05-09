//11. Write a program suppose, it is required to build a project consisting of a number of classes, possibly using a large number of programmers. It is necessary to make sure that every class from which all other classes in the project will be inherited.

public class Main11{
	public static void main(String args[]){
		Mi11X mi11x = new Mi11X();
		mi11x.processor();
		mi11x.manufacturInIndia();
		mi11x.brand();
	}
}

class Xiomi{
	public void brand() {
		System.out.println("This is chinese brand");
	}
}

class XiomiIndia extends Xiomi{
	void manufacturInIndia() {
		System.out.println("Made in China but assambled in india");
	}
}

class Mi11X extends XiomiIndia{
	void processor() {
		System.out.println("870 snapdragon");
	}
}