/*
Where Would This Number Go?

You have a sorted list:
[10, 20, 30, 40, 50]
Given a number, determine the position where it should be inserted while keeping the list sorted.

Examples:
25 → 2
30 → 2
55 → 5
5  → 0

Notice that when 30 already exists, you return its first valid position.
 */

import java.util.ArrayList;
import java.util.List;

public class Where_Would_This_Number_Go {
    public static void  main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();

        int num = 45;
        int index = 0;
        for(int i=0;i<list.size();i++){
            if(num>list.get(i) && num<list.get(i+1)){
                index = i+1;
            } else if (num == list.get(i)) {
                index = i;
            }
        }

        System.out.println(num+" should be at "+index);
    }
}
