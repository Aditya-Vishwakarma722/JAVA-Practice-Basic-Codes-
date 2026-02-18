/*
 * Problem: Divisible Sum Pairs
 *
 * Given an array of integers and a positive integer k,
 * determine the number of pairs (i, j) such that:
 *
 * 1. i < j
 * 2. (ar[i] + ar[j]) is divisible by k
 *
 * In other words, count how many index pairs exist
 * where the sum of the two elements is evenly divisible by k.
 *
 * Parameters:
 * n  -> number of elements in the array
 * k  -> divisor
 * ar -> list of integers
 *
 * Return:
 * The total number of valid pairs.
 *
 * Example:
 * ar = [1, 3, 2, 6, 1, 2]
 * k = 3
 *
 * Valid pairs are those whose sum % 3 == 0.
 * Output: 5
 *
 * Key Idea:
 * For every pair (i, j) where i < j,
 * check if (ar[i] + ar[j]) % k == 0.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class solved{
    public int DivisorCheck(int n, int k, List<Integer> arr){
        int count = 0;
        for(int i=0 ; i< arr.size() ; i++){
            for(int j=i+1 ; j< arr.size() ; j++){
                if((arr.get(i)+arr.get(j))%k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}

public class Divisible_Sum_Pair {
    public static void main(String[] args){
        solved slv = new solved();
        Scanner scn = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = scn.nextInt();
        for(int i=0 ; i<n ; i++){
            arr.add(scn.nextInt());
        }
        int k = scn.nextInt();

        int sum = slv.DivisorCheck(n, k, arr);
        System.out.println(sum);
    }

}
