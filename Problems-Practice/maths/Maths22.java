/*
Balls and Boxes:
You have N balls and K boxes. You want to divide the N balls into K boxes such that:
Each box contains ≥1 balls.
No two boxes contain the same number of balls.
Determine if it is possible to do so.

Input Format:
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space-separated integers N and
K — the number of balls and the number of boxes respectively.

Output Format:
For each test case, output YES if it is possible to divide the N balls into
K boxes such that the conditions are satisfied. Otherwise, output NO.

You may print each character of YES and NO in uppercase or lowercase (for example, yes, yEs, Yes will be considered identical).
 */

import java.util.Scanner;

public class Maths22 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-->0){
            int k = scn.nextInt();
            int n = scn.nextInt();
            int num = k*(k+1)/2;
            if(n>=num) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
