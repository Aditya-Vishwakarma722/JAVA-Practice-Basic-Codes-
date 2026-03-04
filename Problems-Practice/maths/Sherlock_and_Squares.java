/*
    Problem: Sherlock and Squares

    Watson gives Sherlock two integers, a and b.
    Sherlock needs to determine how many perfect square numbers
    exist between a and b (both inclusive).

    A perfect square is a number that can be written as:
        x * x
    where x is an integer.

    In other words:
        Count all integers k such that:
            a ≤ k² ≤ b

    Example 1:
        Input:
            a = 3
            b = 9

        Perfect squares in range:
            4  (2²)
            9  (3²)

        Output:
            2

    Example 2:
        Input:
            a = 17
            b = 24

        No perfect squares exist in this range.

        Output:
            0

    Efficient Approach:

        Instead of checking every number from a to b,
        we use square roots.

        If:
            k² ≥ a
            k² ≤ b

        Then:
            k ≥ √a
            k ≤ √b

        So valid values of k are:

            ceil(√a) to floor(√b)

        Count = floor(√b) - ceil(√a) + 1

        If start > end → return 0

    Time Complexity:
        O(1) per test case

    Space Complexity:
        O(1)

    Key Idea:
        Convert the problem from checking squares
        to counting integers in a valid square-root range.
*/

import java.util.Scanner;

class SolutionCal{
    public int calculate(int a, int b){
        int start = (int)Math.ceil(Math.sqrt(a));
        int end = (int)Math.floor(Math.sqrt(b));
        if(start>end) return 0;
        else return end-start+1;
    }
}

public class Sherlock_and_Squares {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        SolutionCal solution1 = new SolutionCal();
        System.out.println(solution1.calculate(a,b));
    }
}
