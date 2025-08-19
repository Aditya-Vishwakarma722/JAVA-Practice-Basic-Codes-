import java.util.Scanner;

public class Increment_Decrement {
    public static void main(String[] args){
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        num2 = sc.nextInt();

        System.out.println("Pre Increment/Decrement : ");
        num3 = ++num1;
        System.out.println("Increment of First Number : "+num3);
        num4 = --num1;
        System.out.println("Decrement of First Number : "+num4);

        System.out.println("Post Increment/Decrement : ");
        num5 = num2++;
        System.out.println("Increment of Second Number : "+num5);
        num6 = num2--;
        System.out.println("Decrement of Second Number : "+num6);
    }
}
