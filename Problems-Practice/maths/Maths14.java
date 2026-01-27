/*
Negative Product:
Chef is given three numbers A,B, and C.
He wants to find whether he can select exactly two numbers out of these such that the product
of the selected numbers is negative.

Input Format:
The first line of input will contain a single integer T, denoting the number of test cases.
Each test case consists of three integers A,B, and C, the given numbers.

Output Format:
For each test case, output YES if Chef can select exactly two numbers out of these such that the
product of the selected numbers is negative, NO otherwise.
You may print each character in uppercase or lowercase.
For example, the strings NO, no, No, and nO, are all considered identical.
 */

import java.util.Scanner;

public class Maths14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            if(a*b < 0 || a*c < 0 || b*c < 0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
