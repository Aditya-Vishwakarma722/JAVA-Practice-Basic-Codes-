/*
Find the First Occurrence :

A sorted dataset contains duplicates:
[1, 2, 2, 2, 3, 4, 5]
Find the first position of 2.

Expected:
3

Your algorithm may encounter 2 at index 3 or 2,
but it must continue searching toward the left to determine whether an earlier occurrence exists.
 */

import java.util.ArrayList;
import java.util.List;

public class Find_the_Last_Occurrence {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"  ");
        }
        System.out.println();

        int target = 2;
        int left = 0;
        int right = list.size()-1;
        int num = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid) == target) {
                if (mid == 0 || !list.get(mid + 1).equals(target)) {
                    num = mid;
                    break;
                }
                left = mid + 1;
            }
            else if (target < list.get(mid)) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }

        System.out.println(num);
    }
}
