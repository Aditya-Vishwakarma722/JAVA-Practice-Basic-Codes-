/*
 * Problem: Mini-Max Sum (HackerRank)
 *
 * Given five positive integers, find the minimum and maximum values
 * that can be calculated by summing exactly four of the five integers.
 *
 * Print the respective minimum and maximum values as a single line
 * of two space-separated long integers.
 *
 * Example:
 * Input:  [1, 2, 3, 4, 5]
 * Output: 10 14
 *
 * Explanation:
 * Minimum sum = 1 + 2 + 3 + 4 = 10
 * Maximum sum = 2 + 3 + 4 + 5 = 14
 *
 * Approach:
 * - Calculate the total sum of all five integers.
 * - Find the minimum and maximum elements in the list.
 * - Minimum sum = total sum - maximum element.
 * - Maximum sum = total sum - minimum element.
 *
 * Important:
 * - Use long instead of int to prevent integer overflow.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */


import java.util.ArrayList;
import java.util.Scanner;

class MiniMaxSum{
    public void soultion(ArrayList<Long> arr){
        long total = 0;
        long min = arr.get(0);
        long max = arr.get(0);

        for(long num : arr){
            total += num;
            if(num<min)min = num;
            if(num>max)max = num;
        }

        long num1 = total-min;
        long num2 = total-max;
        System.out.println(num1+" "+num2);
    }
}

public class MinMaxSum {
    public static void main(String[] args){
        MiniMaxSum mx = new MiniMaxSum();
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        ArrayList<Long> arr = new ArrayList<>();
        for(int i=0 ; i<size ; i++){
            arr.add(scn.nextLong());
        }
        mx.soultion(arr);
    }
}

