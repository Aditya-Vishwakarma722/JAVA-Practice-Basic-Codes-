/*

Find All Leaders :
An element is a leader if every element to its right is smaller.

Input:
[16, 17, 4, 3, 5, 2]

Output:
[17, 5, 2]
 */

import java.util.ArrayList;
import java.util.List;

public class Find_All_Leaders {
    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>(List.of(16,17,4,3,5,2));
        System.out.println(list1);

        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<list1.size()-1;i++){
            int high = list1.get(i);
            int get = 0;
            for(int j=i+1;j<list1.size();j++){
                if(list1.get(j)>high){
                    get = 1;
                    break;
                }
            }
            if(get!=1){
                list2.add(high);
            }
        }
        list2.add(list1.get(list1.size()-1));
        System.out.println(list2);
    }
}
