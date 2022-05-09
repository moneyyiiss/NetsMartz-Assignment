//8. Create class named as ‘a’ and create a sub class ‘b’. Which is extends from class ‘a’. And use these classes in ‘inherit’ class.
public class Main8 {
    public static void main(String[] args) {
        b obj = new b();
        System.out.println(obj.name);
        System.out.println(obj.no);
    }
}
class a{
    String name = "Money";
}
class b extends a{
    int no = 91;
}
