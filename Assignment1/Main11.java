

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