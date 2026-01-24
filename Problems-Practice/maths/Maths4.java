/*
Find Remainder:
Write a program to find the remainder when an integer A is divided by an integer B.

Input:
The first line contains an integer T, the total number of test cases. Then T lines follow, each line contains two Integers A and B.

Output:
For each test case, find the remainder when A is divided by B, and display it in a new line.

Constraints:
1 ≤ T ≤ 1000
1 ≤ A,B ≤ 10000

 */

import java.util.Scanner;

public class Maths4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t!=0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            System.out.println(a%b);
            t--;
        }
        // Time Complexity = O(t)
    }
}
