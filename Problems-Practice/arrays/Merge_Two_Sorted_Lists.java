/*

Merge Two Sorted Lists :
Given two sorted lists -
A = [1, 4, 7, 10]
B = [2, 3, 8, 9]

produce:
[1, 2, 3, 4, 7, 8, 9, 10]
 */

import java.util.ArrayList;
import java.util.List;

class functionPerform{
    public static List<Integer> merger(List<Integer> list1, List<Integer> list2){
        List<Integer> list3 = new ArrayList<>();
        int i=0;
        int j=0;

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<=list2.get(j)){
                list3.add(list1.get(i));
                i++;
            }
            if(list1.get(i)>=list2.get(j)){
                list3.add(list2.get(j));
                j++;
            }
        }

        while (i<list1.size()){
            list3.add(list1.get(i));
            i++;
        }

        while (j<list2.size()){
            list3.add(list2.get(j));
            i++;
        }

        return list3;
    }
}

public class Merge_Two_Sorted_Lists {
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>(List.of(1,4,7,10));
        List<Integer> list2 = new ArrayList<>(List.of(2,3,8,9));
        System.out.println(list1);
        System.out.println(list2);

        functionPerform functionPerform = new functionPerform();
        List<Integer> result = functionPerform.merger(list1,list2);
        System.out.println(result);

    }
}
