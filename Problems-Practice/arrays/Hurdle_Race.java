/*
 * The Hurdle Race (HackerRank)
 *
 * A character is taking part in a hurdle race.
 *
 * Given:
 *   k -> the maximum height the character can jump naturally
 *   height -> a list of integers representing the height of each hurdle
 *
 * The character can jump any hurdle of height less than or equal to k.
 * If a hurdle is taller than k, the character must drink a magic potion.
 *
 * Each potion increases the character's jump height by 1 unit.
 *
 * Task:
 *   Determine the minimum number of potions the character must drink
 *   in order to be able to jump over the tallest hurdle.
 *
 * Rules:
 *   - If the character can already clear the tallest hurdle,
 *     return 0.
 *   - Otherwise, return (tallest hurdle height - k).
 *
 * Constraints:
 *   - 1 <= height.size() <= 100
 *   - 1 <= k <= 100
 *   - 1 <= height[i] <= 100
 *
 * Example 1:
 *   Input:  k = 4
 *           height = [1, 6, 3, 5, 2]
 *   Output: 2
 *
 *   Explanation:
 *     The tallest hurdle is 6.
 *     The character can jump 4.
 *     Needs 2 potions to reach height 6.
 *
 * Example 2:
 *   Input:  k = 7
 *           height = [2, 5, 4, 5, 2]
 *   Output: 0
 *
 *   Explanation:
 *     The tallest hurdle is 5.
 *     The character can already jump 7.
 *     No potions needed.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class jumps{
    public int potionscheck(List<Integer> heights, int k){
        int max = heights.get(0);
        for(int i=1 ; i<heights.size() ; i++){
            int curr = heights.get(i);
            if(curr>max) max = curr;
        }
        if(k>max) return 0;
        else return max-k;
    }
}

public class Hurdle_Race {
    static void main(String [] args){
        jumps jmp = new jumps();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        List<Integer> heights = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            heights.add(scn.nextInt());
        }
        System.out.println(jmp.potionscheck(heights,k));
    }
}
