package conditionals;
import java.util.Scanner;
public class student_grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int total = sub1+sub2+sub3+sub4+sub5;
        float percentage;
        percentage=((float)total/500)*100;
        if(percentage>=35){
            System.out.println("Student has passed the exam with "+percentage+"%");
        }
        sc.close();
    }
}
