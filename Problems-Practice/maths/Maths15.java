/*
GCD and LCM:
Two integers A and B are the inputs. Write a program to find GCD and LCM of A and B.

Input Format:
The first line contains an integer T, total number of testcases. Then follow T lines, each line contains an integer A and B.

Output Format:
Display the GCD and LCM of A and B separated by space respectively. The answer for each test case must be displayed in a new line.
 */

import java.util.Scanner;

public class Maths15 {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
         while(t!=0){
             int a = scn.nextInt();
             int b = scn.nextInt();
             int gcvalue = gcd(a,b);
             long lcm = (long)a*b/gcvalue;
             System.out.println(gcvalue+" "+lcm);
             t--;
         }
    }
}
