/*
Find the Student :

You are given a list of student roll numbers:
[17, 42, 8, 31, 56, 23]

Given a roll number, determine its index.
target = 31

Output:
3

If it doesn't exist:
Output:
-1
 */

import java.util.ArrayList;
import java.util.List;

public class Find_Student {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(42);
        list.add(8);
        list.add(31);
        list.add(56);
        list.add(23);

        int num=-1;
        int target = 31;
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();

        for(int i=0;i<list.size();i++){
            if(list.get(i) == target){
                System.out.println(target+" found at Index : "+i);
                break;
            }
        }
    }
}
