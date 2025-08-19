import java.util.Scanner;

public class Tax_Calculation {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Annual Salary : ");
        float sal = scn.nextFloat();

        System.out.println("According to your Salary....");
        if(sal<=250000){
            float tax = 0.05f*sal;
            System.out.println("Total Tax to be Paid : "+tax);
        }

        else if(sal<=500000 && sal>250000){
            float tax = 0.20f*sal;
            System.out.println("Total Tax to be Paid : "+tax);
        }

        else{
            float tax = 0.30f*sal;
            System.out.println("Total Tax to be Paid : "+tax);
        }
    }
}
