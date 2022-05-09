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
