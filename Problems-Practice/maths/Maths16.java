/*
Construct N:
You are given an integer N. Find if it is possible to represent N as the sum of
several(possibly zero) 2's and several(possibly zero) 7's.

Formally, find if there exist two integers X,Y (X,Y≥0) such that 2*X+7*Y=N.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of a single line containing an integer N.

Output Format:
For each test case, print on a new line YES if it is possible to represent N as
the sum of several(possibly zero) 2's and several(possibly zero) 7's and NO otherwise.

You may print each character of the string in either uppercase or
lowercase (for example, the strings yEs, yes, Yes, and YES will all be treated as identical).
 */

import java.util.Scanner;

public class Maths16 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t!=0){
            int n = scn.nextInt();
            boolean state = false;
            for(int i=0 ; i*7<=n ; i++){
                int remain = n - 7*i;
                if(remain%2 == 0){
                    state = true;
                    break;
                }
            }

            if(state){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
