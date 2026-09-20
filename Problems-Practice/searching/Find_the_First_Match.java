/*
Find the First Match :

You are given:
[4, 8, 2, 8, 9, 8, 1]
Find the first occurrence of 8.

Output:
1

Do not return the later occurrences.

Then test:
target = 7

Expected:
-1
 */

import java.util.ArrayList;
import java.util.List;

public class Find_the_First_Match {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(8);
        list.add(1);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();

        int num=-1;
        int target = 8;

        for(int i=0;i<list.size();i++){
            if(list.get(i) == target){
                System.out.println(target+" found at Index : "+i);
                num = 1;
                break;
            }
        }

        if(num!=1){
            System.out.println("Not Found!");
        }

    }
}
