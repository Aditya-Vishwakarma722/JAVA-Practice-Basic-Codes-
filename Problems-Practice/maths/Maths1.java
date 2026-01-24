import java.util.Scanner;

/*
Fitness:
Chef wants to become fit for which he decided to walk to
the office and return home by walking.
It is known that Chef's office is X km away from his home.

If his office is open on 5 days in a week, find the number of
kilometers Chef travels through office trips in a week.

Input Format:
1. First line will contain T, number of test cases. Then the test cases follow.
2. Each test case contains of a single line consisting of single integer X.

Output Format:
For each test case, output the number of kilometers Chef travels through office trips in a week.

 */
public class Maths1 {
    static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //Test Cases
        System.out.println("Number of Test Cases : ");
        int T = scn.nextInt();

        while(T!=0){
            System.out.println("Enter Input : ");
            int x = scn.nextInt();
            int res = 2*x*5;
            System.out.println("Answer = "+res);
            T--;

            // Time Complexity = O(1) - for each test case
            // Time Complexity = O(T) - for entire code
        }
    }
}
