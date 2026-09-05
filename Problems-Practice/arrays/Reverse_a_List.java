/*

Reverse a List :
Reverse the elements without creating another list.

Input:
[10, 20, 30, 40, 50]
Output:
[50, 40, 30, 20, 10]
 */

import java.util.ArrayList;
import java.util.List;

public class Reverse_a_List {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List : ");
        System.out.println(list);

        System.out.println("Reversed ArrayList : ");
        List<Integer> list1 = new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        System.out.println(list1);

    }
}