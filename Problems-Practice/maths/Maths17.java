/*
Alternate Additions:
Chef has 2 numbers A and B (A<B).
Chef will perform some operations on A.

In the "i"th operation:
Chef will add 1 to A if i is odd.
Chef will add 2 to A if i is even.
Chef can stop at any instant. Can Chef make A equal to B?

Input Format:
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first and only line of each test case contains two space separated integers A and B.

Output Format:
For each test case, output YES if Chef can make A and B equal, NO otherwise.
Note that the checker is case-insensitive. So, YES, Yes, yEs are all considered same.
 */

import java.util.Scanner;

public class Maths17 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            int d = b-a;
            if(d%3 == 2){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            t--;
        }
    }
}
