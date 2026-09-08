/*
Remove Consecutive Duplicates :

Given:
[1, 1, 2, 2, 2, 3, 4, 4, 5]

produce:
[1, 2, 3, 4, 5]

But:
[1, 2, 1, 2]

must remain:
[1, 2, 1, 2]
*/

import java.util.ArrayList;
import java.util.List;

public class Remove_Consecutive_Duplicates {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(1,1,2,2,2,3,4,4,5));
        System.out.println(list);

        for (int i = list.size() - 1; i > 0; i--) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
