/*
Remove Elements at Even Indices :

Given:
[10, 20, 30, 40, 50, 60]

remove elements at indices:
0, 2, 4...

Result:
[20, 40, 60]
 */

import java.util.ArrayList;
import java.util.List;

public class Remove_Elements_at_Even_Indices {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(10,20,30,40,50,60));
        System.out.println(list);

        for(int i=list.size()-1;i>=0;i--){
            int num = i;
            if(num%2 == 0){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
