import java.util.Scanner;

public class Array_Traversal {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int num;
        System.out.print("Enter the Size of the Array : ");
         num = scn.nextInt();

         int [] arr = new int[num];

         for(int i = 0 ; i<num ; i++){
             System.out.print("Enter Element ["+(i+1)+"] : ");
             arr[i] = scn.nextInt();
         }

        System.out.println("Resultant Array [for loop] : ");
         for(int i = 0 ; i<num ; i++){
             System.out.print(arr[i]+"  ");
         }

        System.out.println(" ");

        System.out.println("Resultant Array [Reversed array] : ");
         for(int i = num-1 ; i>=0 ; i--){
             System.out.print(arr[i]+"  ");
         }

        System.out.println(" ");

        System.out.println("Resultant Array [for each loop] : ");
        for(int obj : arr){
            System.out.print(obj+"  ");
        }

    }

}
