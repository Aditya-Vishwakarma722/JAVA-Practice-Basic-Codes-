/*
Divisible by 3:
Stack likes the number 3 a lot.
He has two non-negative integers A and B.
In one operation, Stack can do either of the following:
A:=∣A−B∣ (change A to ∣A−B∣)
B:=∣A−B∣ (change B to ∣A−B∣)
Note that ∣X∣ denotes absolute value of X. For example ∣−7∣=7 and ∣4∣=4.

Find the minimum number of operations after which at least one integer out of A and B becomes divisible by 3.

Input Format:
The first line of input contains a single integer T, denoting the number of test cases. The description of T test cases follows.
The only line of each test case contains two integers A and B.

Output Format:
For each test case, output in a single line the minimum number of operations after which at least
one integer out of A and B becomes divisible by 3.

 */

import java.util.Scanner;
public class Maths21 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-->0){
            int A = scn.nextInt();
            int B = scn.nextInt();
            int a = (int)(A%3);
            int b = (int)(B%3);

            if(a==0 || b==0) System.out.println(0);
            else if(a==b) System.out.println(1);
            else System.out.println(2);
        }
    }
}
