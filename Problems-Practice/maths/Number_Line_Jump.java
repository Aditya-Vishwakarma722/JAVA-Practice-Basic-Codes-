/*
 * Problem: Number Line Jumps (Kangaroo)
 *
 * Two kangaroos start at different positions on a number line.
 * - Kangaroo 1 starts at position x1 and jumps v1 meters per jump.
 * - Kangaroo 2 starts at position x2 and jumps v2 meters per jump.
 *
 * Both kangaroos jump at the same time and make jumps of equal length intervals.
 *
 * The task is to determine whether they will land at the same position
 * after the same number of jumps.
 *
 * Return:
 * "YES"  -> if they land at the same position at the same time
 * "NO"   -> otherwise
 *
 * Mathematically:
 * We check if there exists a non-negative integer n such that:
 *
 *      x1 + n * v1 = x2 + n * v2
 *
 * If such n exists, return "YES"; otherwise, return "NO".
 */

import java.util.*;

class LineJump{
    public String calculate(int x1, int x2, int v1, int v2){
        if(v1 == v2){
            if(x2 == x1) return "YES";
            else return "NO";
        }
        if((x2-x1)%(v1-v2) == 0 && (x2-x1)/(v1-v2)>=0) return "YES";
        return "NO";
    }
}

public class Number_Line_Jump {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        LineJump lj  =new LineJump();

        int x1 = scn.nextInt();
        int x2 = scn.nextInt();
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();

        String res = lj.calculate(x1, x2, v1, v2);
        System.out.println(res);
    }
}
