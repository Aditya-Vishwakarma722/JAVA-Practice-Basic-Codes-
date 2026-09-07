/*

Insert at the Correct Position :
You are given a sorted list and a new number.
Insert the number while keeping the list sorted.

List: [10, 20, 30, 40, 50]
Insert: 35
Output: [10, 20, 30, 35, 40, 50]
 */

import java.util.ArrayList;
import java.util.List;

public class Insert_at_Correct_Position {
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>(List.of(10,20,30,40,50));
        System.out.println(list1);
        int num = 35;
        boolean done = false;

        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<list1.size();i++){
            int current = list1.get(i);

            if(!done && current>num){
                list2.add(num);
                done = true;
            }
            list2.add(current);
        }

        System.out.println(list2);
    }
}
