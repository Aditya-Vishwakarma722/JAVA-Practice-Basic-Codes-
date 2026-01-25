/*
Scalene Triangle:
Given A, B, C as the sides of a triangle, find whether the triangle is scalene.

Note:
A triangle is said to be scalene if all three sides of the triangle are distinct.
It is guaranteed that the sides represent a valid triangle.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of three space-separated integers A,B, and C — the length of
the three sides of the triangle.

Output Format:
For each test case, output on a new line, YES, if the triangle is scalene, and NO otherwise.
You may print each character of the string in uppercase or lowercase. For example,
YES, yes, Yes, and yEs are all considered identical.
*/

import java.util.Scanner;

public class Maths6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t!=0){
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = scn.nextInt();
            if(x!=y && x!=z && y!=z){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
