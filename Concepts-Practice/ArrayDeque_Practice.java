import java.util.ArrayDeque;
import java.util.Scanner;

public class ArrayDeque_Practice {
    static void main() {

        ArrayDeque<Float> floater = new ArrayDeque<>();
        floater.add(90.87f);
        floater.add(71.59f);
        floater.add(63.21f);
        floater.add(15.86f);
        floater.add(85.64f);
        floater.add(62.73f);
        floater.addLast(72.43f);
        floater.addFirst(13.81f);

        System.out.println("\nArrayDeque List : ");
        for(Float rows : floater){
            System.out.print(rows+" | ");
        }
    }
}
