/*
Replace Invalid Marks :
A student marks list contains values from 0–100, but some entries are invalid.
Replace every invalid value with -1.

Input:
[78, -4, 91, 120, 65, -1]
Output:
[78, -1, 91, -1, 65, -1]

 */

import java.util.ArrayList;
import java.util.List;

public class Replace_Invalid_Marks {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(-4);
        list.add(91);
        list.add(120);
        list.add(65);
        list.add(-1);
        System.out.println(list);

        System.out.println("Enhanced List : ");
        for(int i=0;i<list.size();i++){
            if(list.get(i)<0 || list.get(i)>100){
                list.set(i, -1);
            }
        }

        System.out.println(list);

    }
}
