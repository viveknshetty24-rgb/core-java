package loops;
import java.util.Scanner;
public class sum_of_firstn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum of first "+n+" natural numbers is "+sum);
        sc.close();
    }
}
