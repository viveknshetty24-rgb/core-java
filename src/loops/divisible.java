package loops;

public class divisible {
    public static void main(String[] args){
        int n=7;
        System.out.println("These numbers are perfectly divisible by 7 in range of 50 to 100:");
        for(int i=50;i<=100;i++){
            if(i%n==0){
                System.out.println(i);
            }
        }
    }
}
