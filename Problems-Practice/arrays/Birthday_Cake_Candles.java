/*
 * Problem: Birthday Cake Candles (HackerRank)
 *
 * Given a list of integers representing the heights of birthday cake candles,
 * determine how many candles are tallest.
 *
 * The tallest candles can be blown out, so we must count how many candles
 * have the maximum height in the list.
 *
 * Example:
 * Input:  [3, 2, 1, 3]
 * Output: 2
 *
 * Approach:
 * - Initialize the first element as the maximum height.
 * - Traverse the list once.
 * - If a taller candle is found, update the maximum and reset count.
 * - If a candle equals the current maximum, increment the count.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.ArrayList;
import java.util.Scanner;

class BirthdayCakeCalculate{
    public int result(ArrayList<Integer> candles){
        int size = candles.size();
        int count = 1;
        int max = candles.get(0);

        for(int i=1 ; i<size ; i++){
            if(candles.get(i)>max){
                max = candles.get(i);
                count=1;
            }
            else if(candles.get(i)==max){
                count++;
            }
        }
        return count;
    }
}

public class Birthday_Cake_Candles {
    public static void main(String[] args){
        BirthdayCakeCalculate bcc = new BirthdayCakeCalculate();
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer> candles = new ArrayList<>();
        int size = scn.nextInt();
        for(int i= 0 ; i<size ; i++){
            candles.add(scn.nextInt());
        }
        int res = bcc.result(candles);
        System.out.println(res);
    }
}
