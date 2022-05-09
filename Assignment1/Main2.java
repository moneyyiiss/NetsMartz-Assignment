//2. Write a program create a class ‘simpleobject‘. Using constructor display the message.
class simpleobject {
    String message;
    simpleobject(String str){
        message = str;
    }
    void display(){
        System.out.println(message);
    }

}
public class Main2 {
    public static void main(String[] args) {
        simpleobject s = new simpleobject("This is message");
        s.display();
    }
}
