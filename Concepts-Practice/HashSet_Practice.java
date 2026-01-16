import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;

public class HashSet_Practice {
    static void main() {

        HashSet<Integer> Hset = new HashSet<>();
        Hset.add(10);
        Hset.add(20);
        Hset.add(30);
        Hset.add(40);
        Hset.add(50);
        Hset.add(60);
        System.out.println("Size of the Hashset : "+Hset.size());
        System.out.println("Elements in the Hashset : "+Hset);

        Hset.remove(20);
        System.out.println("New Hashset : "+Hset);
        System.out.println("Does Hashset Contains 80? : "+Hset.contains(80));
        Hset.clear();
        System.out.println(Hset);
        System.out.println("Is the Hashset Empty now? : "+Hset.isEmpty());

    }
}
