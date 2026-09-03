/*
Remove All Occurrences:
Given a list of integers and a number x, remove every occurrence of x.

Input:
[4, 2, 7, 2, 9, 2, 5]
x = 2

Output:
[4, 7, 9, 5]
 */


import java.util.ArrayList;
import java.util.List;

public class Remove_All_Occurrences {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(2);
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(5);
        System.out.println(list);

        int i=0;
        int k=1;
        while(i<list.size()-1){
            int curr = list.get(i);
            if(curr == list.get(k)){
                list.remove(k);
                k++;
            }
            i++;
        }
        System.out.println(list);
    }
}
