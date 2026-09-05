/*
Check Whether a List Is Sorted :
Determine whether a list is sorted in ascending order.

[1, 2, 3, 4, 5] → true
[1, 3, 2, 4, 5] → false
 */

import java.util.ArrayList;
import java.util.List;

class sortCheck{
    sortCheck(List<Integer> list){
        boolean b = true;
        for(int i=0;i<list.size()-1;i++){
            int j=i+1;
            if(list.get(i)>list.get(j)){
                b = false;
            }
        }
        System.out.println(list+" : "+b);
    }
}


public class checkSortedList {
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>(List.of(10,20,30,40,50));
        List<Integer> list2 = new ArrayList<>(List.of(10,30,20,50,40));
        System.out.println("List 1 : "+list1);
        System.out.println("List 2 : "+list2);

        sortCheck sortCheck1 = new sortCheck(list1);
        sortCheck sortCheck2 = new sortCheck(list2);

    }
}