/*
7 Rings:
In Chefland, a valid phone number consists of 5 digits with no leading zeros.
For example, 98765, 10000 and 71023 are valid phone numbers while 04123,9231, and 872310 are not.

Chef went to a store and purchased N items, where the cost of each item is X.
Find whether the total bill is equivalent to a valid phone number.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of two space-separated integers
N and X — the number of items Chef bought and the cost per item.

Output Format:
For each test case, output on a new line, YES, if the total bill is equivalent
to a valid phone number and NO otherwise.
Each character of the output may be printed in either uppercase or lowercase.
That is, the strings NO, no, nO, and No will be treated as equivalent.
 */

import java.util.Scanner;

public class Maths10 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t!=0) {
            int N = scn.nextInt();
            int X = scn.nextInt();
            if (N * X >= 10000 && N * X <= 99999 ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
    }
}
