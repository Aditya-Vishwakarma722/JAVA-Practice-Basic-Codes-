import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Practice<I extends Number> {
     public static void main() {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> arrlist = new ArrayList<>();
        System.out.println("Enter the Elements [Limit - 5] : ");
        for(int i = 0 ; i <5 ; i++){
            int num = scn.nextInt();
            arrlist.add(num);
        }

         System.out.println("Elements in the ArrayList : ");
        for(int numbs : arrlist) System.out.print(numbs+", ");

        ArrayList<Float> floater = new ArrayList<>();
        floater.add(0,90.87f);
        floater.add(1,71.59f);
        floater.add(2,63.21f);
        floater.add(3,15.86f);
        floater.add(4,85.64f);
        floater.add(0,62.73f);

         System.out.println("\nAnother Array List : ");
        for(Float rows : floater){
            System.out.print(rows+", ");
        }
    }
}
