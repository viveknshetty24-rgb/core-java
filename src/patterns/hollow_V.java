package patterns;

import java.util.Scanner;

public class hollow_V {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("V ");
                } else {
                    System.out.print("  ");
                }
            }
                System.out.println();
        }
        sc.close();
    }
}
