import java.util.Scanner;
public class Main5 {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            String str1 = scn.nextLine();
            String str2 = scn.nextLine();

            if(str1.equals(str2))
                System.out.println("Strings are Equals");
            else
                System.out.println("Strings are not Equals");

        }
    }
}




