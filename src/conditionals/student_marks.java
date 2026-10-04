package conditionals;

import java.util.Scanner;

public class student_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of 5 subjects: ");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int lowest;
        if (sub1 <= sub2 && sub1 <= sub3 && sub1 <= sub4 && sub1 <= sub5) {
            lowest = sub1;
        } else if (sub2 <= sub1 && sub2 <= sub3 && sub2 <= sub4 && sub2 <= sub5) {
            lowest = sub2;
        } else if (sub3 <= sub1 && sub3 <= sub2 && sub3 <= sub4 && sub3 <= sub5) {
            lowest = sub3;
        } else if (sub4 <= sub1 && sub4 <= sub2 && sub4 <= sub3 && sub4 <= sub5) {
            lowest = sub4;
        } else {
            lowest = sub5;
        }
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        int top4Total = total - lowest;
        float percentage = ((float) top4Total / 400) * 100;
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Overall percentage: " + percentage + "%");
        sc.close();
    }
}
