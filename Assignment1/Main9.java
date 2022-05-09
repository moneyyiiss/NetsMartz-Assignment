//9. Write a program to give the example for method overriding concepts.
public class Main9 {
    public static void main(String[] args) {
        Fan obj = new Fan();
        obj.air();
    }
}
class Cooler{

    void air(){
        System.out.println("My velocity is greater than you");
    }
}

class Fan extends Cooler{

    void air(){
        System.out.println("I am happy with velocity");
    }


}
