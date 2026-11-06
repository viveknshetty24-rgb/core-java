package basic;

import java.util.Scanner;
public class square_cube {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int square;
        int cube;
        square = num * num;
        cube = num * num * num;
        System.out.println("The Square of "+num+" is "+square);
        System.out.println("The Cube of "+num+" is "+cube);
        sc.close();
    }
}
