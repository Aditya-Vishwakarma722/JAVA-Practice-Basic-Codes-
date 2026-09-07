/*
Second Largest Without Sorting :
Find the second-largest distinct value.

Input:
[10, 5, 20, 8, 20, 15]
Output:
15
 */

import java.util.ArrayList;
import java.util.List;

public class Second_Largest_Without_Sorting {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(10,5,20,8,20,15));
        System.out.println(list);

        int largest = 0;
        for(int i=0;i<list.size();i++){
            int current = list.get(i);
            if(current>largest){
                largest = current;
            }
        }

        int large=0;
        for(int i=0;i<list.size();i++){
            int current = list.get(i);
            if(current>large && current<largest){
                large=current;
            }
        }

        System.out.println(large);
    }
}
