/*
Test Averages:
Chef has scored A,B and C marks in 3 different subjects respectively.

Chef will fail if the average score of any two subjects is less than 35. Determine whether Chef will pass or fail.

Input Format:
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of a single line of input, three integers A, B, C, denoting the Chef's score in the three subjects.

Output Format:
For each test case, if Chef will pass, print PASS, otherwise print FAIL.
You may print each character of the string in uppercase or lowercase (for example, the strings pass, Pass, pAss, and PASS
will all be treated as identical).
*/

import java.util.Scanner;

public class Maths9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int A = scn.nextInt();
            int B = scn.nextInt();
            int C = scn.nextInt();
            if((A+B)/2<35 || (A+C)/2<35 || (B+C)/2<35){
                System.out.println("FAIL");
            }
            else{
                System.out.println("PASS");
            }
            t--;
        }
    }
}
