/*
 * Sales by Match - HackerRank
 *
 * There is a pile of socks where each sock has a color represented by an integer.
 * Given an array of integers 'ar', where each value represents the color of a sock,
 * determine how many matching pairs of socks can be formed.
 *
 * A pair consists of two socks of the same color.
 *
 * Task:
 * Count the total number of matching pairs in the given list.
 *
 * Input:
 * - n  : total number of socks
 * - ar : list of integers representing sock colors
 *
 * Output:
 * - Return the total number of matching pairs.
 *
 * Example:
 * ar = [1, 2, 1, 2, 1, 3, 2]
 *
 * Color 1 appears 3 times → 1 pair
 * Color 2 appears 3 times → 1 pair
 * Color 3 appears 1 time  → 0 pairs
 *
 * Total pairs = 2
 *
 * Hint:
 * Count the frequency of each color and add (frequency / 2) to the result.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class matching{
    public int pairMatching(List<Integer> arr){
        int [] freq = new int[101];

        for(int num : arr){
            freq[num]++;
        }
        int pair = 0;
        for(int i=0 ; i<freq.length ; i++){
            pair+=freq[i]/2;
        }
        return pair;
    }
}

public class Sales_by_Match {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        int n = scn.nextInt();
        for(int i=0 ; i<n ; i++){
            arr.add(scn.nextInt());
        }
        matching mc = new matching();
        int res = mc.pairMatching(arr);
        System.out.println(res);
    }
}
