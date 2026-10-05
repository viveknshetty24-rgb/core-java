package loops;
import java.util.Scanner;
public class even_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        System.out.println("The Even numbers from 1 to "+n+" Are");
        for(int i=2;i<=n;i=i+2){
            System.out.println(i);
        }
        sc.close();
    }
}
