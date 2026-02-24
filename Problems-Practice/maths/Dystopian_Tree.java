/*
 * Utopian Tree (HackerRank)
 *
 * The Utopian Tree goes through two types of growth cycles every year:
 *
 *   1) Spring Cycle  -> The tree doubles in height.
 *   2) Summer Cycle  -> The tree increases in height by 1 meter.
 *
 * The tree starts with an initial height of 1 meter.
 *
 * Growth pattern:
 *   - Cycle 1 (Spring)  -> height doubles
 *   - Cycle 2 (Summer)  -> height += 1
 *   - Cycle 3 (Spring)  -> height doubles
 *   - Cycle 4 (Summer)  -> height += 1
 *   - and so on...
 *
 * Given:
 *   n -> the number of growth cycles
 *
 * Task:
 *   Determine and return the height of the tree after n cycles.
 *
 * Rules:
 *   - If n = 0, the height remains 1.
 *   - Odd-numbered cycles are Spring (double the height).
 *   - Even-numbered cycles are Summer (add 1 to height).
 *
 * Constraints:
 *   - 0 <= n <= 60
 *
 * Example 1:
 *   Input:  n = 0
 *   Output: 1
 *
 * Example 2:
 *   Input:  n = 1
 *   Output: 2
 *   Explanation:
 *     Start at 1
 *     Cycle 1 (Spring) -> 1 × 2 = 2
 *
 * Example 3:
 *   Input:  n = 4
 *   Output: 7
 *
 *   Explanation:
 *     Start at 1
 *     Cycle 1 -> 2
 *     Cycle 2 -> 3
 *     Cycle 3 -> 6
 *     Cycle 4 -> 7
 */

import java.util.Scanner;

class resultDT{
    public int incrementHeight(int n){
        if(n==0)return 1;
        int num = 1;
        for(int i=1 ; i<=n ; i++){
            if(i%2==0)num+=1;
            else num*=2;
        }
        return num;
    }
}

public class Dystopian_Tree {
    public static void main(String [] args){
        resultDT rsdt = new resultDT();
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int n = scn.nextInt();
            System.out.println(rsdt.incrementHeight(n));
            t--;
        }
    }
}
