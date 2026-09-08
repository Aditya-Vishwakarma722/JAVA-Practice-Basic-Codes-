/*
Find a Continuous Subarray With Given Sum :

Given: [1, 4, 20, 3, 10, 5]
and: target = 33
find a continuous section whose sum equals 33.

Expected:
[20, 3, 10]
 */

import java.util.ArrayList;
import java.util.List;

public class Find_Continuous_Subarray_With_Given_Sum {
    public static void main(String [] args){
        List<Integer> list = new ArrayList<>(List.of(1,4,20,3,10,5));
        System.out.println(list);
        List<Integer> result = new ArrayList<>();
        int target = 33;

        int currentSum = 0;
        int start = 0;
        boolean found = false;

        for (int end = 0; end < list.size(); end++) {
            currentSum += list.get(end);

            while (currentSum > target && start < end) {
                currentSum -= list.get(start);
                start++;
            }

            if (currentSum == target) {
                for (int i = start; i <= end; i++) {
                    result.add(list.get(i));
                }
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Subarray found: " + result);
        } else {
            System.out.println("No subarray found with the given sum.");
        }
    }
}
