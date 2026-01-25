/*
Sum of Digits:
You're given an integer N. Write a program to calculate the sum of all the digits of N.

Input Format:
The first line contains an integer T, the total number of testcases. Then follow T lines, each line contains an integer N.

Output Format:
For each test case, calculate the sum of digits of N, and display it in a new line.
 */

import java.util.*;
public class Maths7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int num = scn.nextInt();
            int sum = 0;
            while(num!=0){
                sum += num%10;
                num/=10;
            }
            System.out.println(sum);
            t--;
        }
    }
}
