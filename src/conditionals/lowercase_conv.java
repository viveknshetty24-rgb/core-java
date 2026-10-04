package conditionals;

import java.util.Scanner;

public class lowercase_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z') {
            char lowercase = (char) (ch + 32);
            System.out.println(lowercase);
        } else {
            System.out.println("Please Enter a Upper Case Letter!");
        }
        sc.close();
    }
}
