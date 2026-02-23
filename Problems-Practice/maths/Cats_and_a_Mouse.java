/*
 * Cats and a Mouse (HackerRank)
 *
 * Two cats and a mouse are positioned on a number line.
 *
 * Given:
 *   x -> position of Cat A
 *   y -> position of Cat B
 *   z -> position of Mouse C
 *
 * Both cats move at the same speed and can move one unit per step
 * either left or right along the number line.
 *
 * Task:
 *   Determine which cat will reach the mouse first.
 *
 * Rules:
 *   - If Cat A reaches the mouse first, return "Cat A"
 *   - If Cat B reaches the mouse first, return "Cat B"
 *   - If both cats reach the mouse at the same time,
 *     the mouse escapes while they fight, return "Mouse C"
 *
 * Constraints:
 *   - Positions are integers on a number line
 *   - All values are within valid integer range
 *
 * Example 1:
 *   Input:  x = 1, y = 2, z = 3
 *   Output: "Cat B"
 *
 * Example 2:
 *   Input:  x = 1, y = 3, z = 2
 *   Output: "Mouse C"
 *
 * Explanation:
 *   The distance each cat must travel is the absolute difference
 *   between its position and the mouse's position.
 *   The cat with the smaller distance wins.
 */

import java.util.Scanner;

class stepsCheck{
    public String catA_catB(int x, int y, int z){
        int Astpes = Math.abs(x-z);
        int Bsteps = Math.abs(y-z);
        if(Astpes<Bsteps) return "Cat A";
        else if(Bsteps<Astpes) return "Cat B";
        else return "Mouse C";
    }
}

public class Cats_and_a_Mouse {
    public static void main(String[] args){
        stepsCheck stp = new stepsCheck();
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        System.out.println(stp.catA_catB(x,y,z));
    }
}
