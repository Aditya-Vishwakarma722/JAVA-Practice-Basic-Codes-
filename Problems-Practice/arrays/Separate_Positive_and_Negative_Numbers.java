/*
Separate Positive and Negative Numbers :

Given:
[3, -2, 5, -7, 8, -1, 4]

produce:
[3, 5, 8, 4, -2, -7, -1]

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Separate_Positive_and_Negative_Numbers {
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>(List.of(3,-2,5,-7,8,-1,4));
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        for(int i=list1.size()-1;i>=0;i--) {
            int current = list1.get(i);
            if (current < 0) {
                list2.add(current);
                list1.remove(i);
            }
        }

        for(int i=list2.size()-1;i>=0;i--){
            list1.add(list2.get(i));
        }

        System.out.println(list1);
    }
}