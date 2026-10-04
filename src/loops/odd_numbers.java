package loops;

import java.util.Scanner;
public class odd_numbers {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the value of n:");
         int n=sc.nextInt();
         System.out.println("The Odd numbers from 1 to "+n+" Are");
         for(int i=1;i<=n;i=i+2){
             System.out.println(i);
         }
         sc.close();
    }
}
