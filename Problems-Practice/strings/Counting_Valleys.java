/*
 * Counting Valleys - HackerRank
 *
 * A hiker is walking along a trail that consists of steps up and down.
 * The path is represented by a string where:
 *
 *   'U' → Step Up (increase altitude by 1)
 *   'D' → Step Down (decrease altitude by 1)
 *
 * The hiker starts at sea level (altitude = 0).
 *
 * A valley is defined as:
 * - A sequence of consecutive steps below sea level,
 * - Starting with a step down from sea level,
 * - Ending when the hiker returns to sea level.
 *
 * Task:
 * Given the total number of steps (n) and the step sequence (steps),
 * determine how many valleys the hiker walked through.
 *
 * Important:
 * - Count a valley only when the hiker comes back to sea level
 *   from below sea level.
 * - Do NOT count mountains (sequences above sea level).
 *
 * Example:
 * Input:
 *   n = 8
 *   steps = "UDDDUDUU"
 *
 * Output:
 *   1
 *
 * Explanation:
 * The hiker goes below sea level once and returns once,
 * completing one valley.
 */


import java.util.Scanner;

class counting{
    int counter(int n, String steps){
        int level = 0;
        int count = 0;
        for(int i=0 ; i<n ; i++){
            if(steps.charAt(i) == 'D'){
                level--;
            }
            else if(steps.charAt(i) == 'U'){
                level++;
                if(level==0){
                    count++;
                }
            }
        }
        return count;
    }
}

public class Counting_Valleys {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        counting cnt = new counting();
        int n = scn.nextInt();
        scn.nextLine();
        String steps = scn.nextLine();
        System.out.println(cnt.counter(n, steps));
        scn.close();
    }
}
