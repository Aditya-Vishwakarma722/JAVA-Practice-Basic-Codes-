/*

Move All Zeroes to the End :
Given a list of integers, move all 0s to the end while maintaining the relative order of non-zero elements.

Input:
[0, 1, 0, 3, 12]
Output:
[1, 3, 12, 0, 0]

 */


import java.util.ArrayList;
import java.util.List;

public class All_Zeroes_at_End {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(3);
        list.add(12);
        System.out.println(list);

        int insert = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i) != 0){
                list.set(insert,list.get(i));
                insert++;
            }
        }

        while(insert<list.size()){
            list.set(insert,0);
            insert++;
        }

        System.out.println(list);

    }
}
