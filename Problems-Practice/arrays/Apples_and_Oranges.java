/*
 * Problem: Apple and Orange (HackerRank)
 *
 * Sam's house is located between points s and t on a number line.
 * There is an apple tree at point a and an orange tree at point b.
 *
 * Each apple or orange falls at some distance from its tree.
 * - Positive distance → fruit falls to the right of the tree.
 * - Negative distance → fruit falls to the left of the tree.
 *
 * Task:
 * Determine how many apples and oranges land on Sam's house.
 *
 * Approach:
 * - For each apple, calculate its final position: a + distance.
 *   If it is between s and t (inclusive), increment apple count.
 * - For each orange, calculate its final position: b + distance.
 *   If it is between s and t (inclusive), increment orange count.
 * - Print the counts: first line for apples, second line for oranges.
 *
 * Example:
 * s = 7, t = 11, a = 5, b = 15
 * apples = [2, 3, -2], oranges = [-3, -2, 1]
 * Output:
 * 1  // only one apple lands on the house
 * 2  // two oranges land on the house
 *
 * Time Complexity: O(n + m) where n and m are the sizes of apple and orange arrays.
 * Space Complexity: O(1) (if extra arrays are avoided)
 */

import java.util.ArrayList;
import java.util.Scanner;

class calculateDistance{
    public void measure(int s, int t, int m, int n, int a, int b, ArrayList<Integer> apples, ArrayList<Integer> oranges){
        int count1 = 0;
        int count2 = 0;

        for(int distance : apples){
            int pos = a+distance;
            if(pos>=s && pos<=t)count1++;
        }

        for(int distance: oranges){
            int pos = b+distance;
            if(pos<=t && pos>=s)count2++;
        }

        System.out.println(count1);
        System.out.println(count2);
    }
}

public class Apples_and_Oranges {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int s = scn.nextInt();
        int t = scn.nextInt();
        int m = scn.nextInt();
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        ArrayList<Integer> apples = new ArrayList<>();
        ArrayList<Integer> oranges = new ArrayList<>();

        for(int i=0 ; i<m ; i++){
            apples.add(scn.nextInt());
        }

        for(int i=0 ; i<n ; i++){
            oranges.add(scn.nextInt());
        }


    }
}
