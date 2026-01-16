import java.util.Scanner;

public class Logical_If_Else {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int num1 = scn.nextInt();

        System.out.print("Enter the Second Number : ");
        int num2 = scn.nextInt();

        System.out.print("Enter the Third Number : ");
        int num3 = scn.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println(num1+" is Greater than "+num2+" & "+num3);
        }

        else if(num2 > num1 && num2 > num3){
            System.out.println(num2+" is Greater than "+num1+" & "+num3);
        }

        else{
            System.out.println(num3+" is Greater than "+num1+" & "+num2);
        }
    }

}
