/*
Make AP:
Chef is given two integers A and C such that A≤C.
Chef wants to find whether there exists any integer B such that A,B, and C are in arithmetic progression.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers A and C, the given integers.

Output Format:
For each test case, output −1 if there exists no integer B such that A,B, and C are in arithmetic progression.
Else, output the value of B.
 */

import java.util.Scanner;

public class Maths11 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int a = scn.nextInt();
            int c = scn.nextInt();
                if((a+c)%2 == 0){
                    int b = (a+c)/2;
                    System.out.println(b);
                }
                else {
                    System.out.println("-1");
                }
            t--;
        }
    }
}
