/*
Common Elements :
Given two lists, find all elements that appear in both.

A = [10, 20, 30, 40]
B = [30, 40, 50, 60]

Output:
[30, 40]

 */

import java.util.ArrayList;
import java.util.List;

public class Common_Elements {
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>(List.of(10,20,30,40));
        List<Integer> list2 = new ArrayList<>(List.of(30,40,50,60));
        System.out.println(list1+"\n"+list2);

        for(int i=0;i<list1.size();i++){
            for(int k=0;k<list2.size();k++){
                if(list1.get(i) == list2.get(k)){
                    System.out.print(list1.get(i)+"  ");
                }
            }
        }

        /*
        
        OR :

        list1.retainAll(list2);
        System.out.println(list2);

         */

    }
}
