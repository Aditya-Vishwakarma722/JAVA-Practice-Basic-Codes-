import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Practice {
    static void main() {

                Scanner scn = new Scanner(System.in);
                LinkedList<Integer> lnkdlist = new LinkedList<>();

                System.out.println("Enter the Size of the Linked List : ");
                int size = scn.nextInt();

                System.out.println("Enter the Elements [Limit - 5] : ");
                for(int i = 0 ; i < size ; i++){
                    int num = scn.nextInt();
                    lnkdlist.add(num);
                }

                System.out.println("Elements in the LinkedList : ");
                for(int numbs : lnkdlist) System.out.print(numbs+", ");

                LinkedList<Float> floater = new LinkedList<>();
                floater.add(0,90.87f);
                floater.add(1,71.59f);
                floater.add(2,63.21f);
                floater.add(3,15.86f);
                floater.add(4,85.64f);
                floater.add(0,62.73f);
                floater.addLast(72.43f);
                floater.addFirst(13.81f);

                System.out.println("\nAnother Array List : ");
                for(Float rows : floater){
                    System.out.print(rows+", ");
                }
    }
}
