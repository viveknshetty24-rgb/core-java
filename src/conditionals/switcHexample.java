package conditionals;

import java.util.Scanner;

public class switcHexample {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int num2= sc.nextInt();
        System.out.println("Enter the Operator:");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch (operator){
            case '+' : result = num1+num2;
            System.out.println(num1+"+"+num2+"="+result);
            break;
            case '-' : result = num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
                break;
            case '*' : result = num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
                break;
            case '/':if(num2==0){
                System.out.println("Error Divison By Zero!!");
            }else {
                float result1 = (float)num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" +  result1);
            }
            break;
                default:System.out.println("!Invalid Operator");
        }
    }
}
