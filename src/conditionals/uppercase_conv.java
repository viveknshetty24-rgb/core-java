package conditionals;

import java.util.Scanner;
public class uppercase_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            char uppercase = (char) (ch - 32);
            System.out.println(uppercase);
        } else {
            System.out.println("Please Enter a Lower Case Letter!");
        }
        sc.close();
    }
}
