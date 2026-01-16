import java.util.Scanner;

public class Factorial {
    public static void main(String[] ags){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number to Find it's Factorial : ");
        int num = scn.nextInt();

        int product = num;

        for(int i = num-1 ; i>0 ;i--){
            product*=i;
        }

        System.out.println("Factorial of "+num+" = "+product);
    }

}
