import java.util.Scanner;

public class SumofPrevNumbers {
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sn.nextInt();

        int sum = 0;
        for(int i = 0 ; i<=num ; i++){
            if(i%2 != 0){
               sum+=i;}
        }
        System.out.println("The sum of all Number : "+sum);

        System.out.println(" ");

        System.out.println("Reverse Multiplication : ");
        System.out.print("Enter the Number : ");
        int table = sn.nextInt();

        for(int i = 10 ; i>0 ; i--){
            System.out.println(table+" * "+i+" = "+(table*i));
        }
    }
}
