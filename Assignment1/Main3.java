//3. Write a program to give the example for ‘this’ operator.
class r{
    String name;
    void setdata(String n){

        this.name = n;
    }
    void displaydata(){

        System.out.println(name);
    }
}
public class Main3 {
    public static void main(String[] args) {
        r r1 = new r();
        r1.setdata("Manish");
        r1.displaydata();
    }
}

