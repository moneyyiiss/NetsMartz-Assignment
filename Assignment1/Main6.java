
public class Main6 {
    public static void main(String[] args) {
vol_con vc = new vol_con();
        vc.m('a');
        vc.m('i');
    }
}
class vol_con {

    void m(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("vowel");
        }else{
            System.out.println("consonent");
        }
    }

}





