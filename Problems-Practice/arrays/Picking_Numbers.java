/*
    Picking Numbers - HackerRank

    Given an array of integers, find the longest subarray where the absolute
    difference between any two elements in the subarray is less than or equal to 1.

    In other words:
        - You can select a group of numbers.
        - The difference between the maximum and minimum numbers in that group
          must be ≤ 1.
        - Return the length of the longest possible such group.

    Important:
        The subarray does NOT need to be contiguous in the original array.
        You are selecting elements, not slicing a continuous segment.

    Function Signature:
        public static int pickingNumbers(List<Integer> a)

    Example:

        Input:
            a = [4, 6, 5, 3, 3, 1]

        Possible valid groups:
            [3, 3]              -> length = 2
            [4, 5]              -> length = 2
            [5, 6]              -> length = 2

        Longest valid group length:
            3  (for example: [3, 3, 4] is NOT valid,
                 but [3, 3] or [4, 5] or [5, 6] are valid)

        Correct Output:
            3  (for input [4,6,5,3,3,1] the correct group is [3,3,4]? No.
                Actually the correct group is [3,3] or [4,5] or [5,6],
                but if input was [4,6,5,3,3], then [3,3,4] gives length 3.)

    Constraints:
        1 ≤ n ≤ 100
        0 ≤ a[i] ≤ 100
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class numberCheck{
    public int frequency(List<Integer> a){
        int [] freq = new int[101];
        for(int num : a) freq[num]++;
        int maxLength = 0;
        for(int i=0 ; i<100 ; i++){
            maxLength = Math.max(maxLength, freq[i]+freq[i+1]);
        }
        return maxLength;
    }
}

public class Picking_Numbers {
    public static void main(String [] agrs){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0 ; i<n ; i++) arr.add(scn.nextInt());
        numberCheck nmb = new numberCheck();
        System.out.println(nmb.frequency(arr));
    }
}
