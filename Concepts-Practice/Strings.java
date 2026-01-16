import java.util.Scanner;

public class Strings {
    public static void main(String[] args){
        String name = "Aditya";
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Statement : ");
        String intro = scn.nextLine();

        System.out.print(intro);
        System.out.println(name);

        int num1 = 1234;
        float num2 = 493.468f;

        System.out.printf("The Value of Number 1 : %d",num1);
        System.out.println();
        System.out.printf("The Value of Number 2 : %.3f",num2);
    }
}
