/*
Rotate List by K Positions :
Rotate the list to the right by K.

Input:
[1, 2, 3, 4, 5]
K = 2

Output:
[4, 5, 1, 2, 3]
 */

import java.util.ArrayList;
import java.util.List;

public class Rotate_List_by_K_Positions {
    public static void main(String [] args){
            List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
            List<Integer> list2 = new ArrayList<>();
            System.out.println(list1);
            int k=2;

            for(int i=0;i<list1.size();i++){
                if(i > k){
                    int current = list1.get(i);
                    list2.add(current);
                }
            }

            for(int i=0;i<list1.size();i++){
                if(i<=k){
                    list2.add(list1.get(i));
                }
            }

        System.out.println(list2);
        }
}
