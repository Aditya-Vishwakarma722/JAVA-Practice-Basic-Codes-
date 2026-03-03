/*
    Problem: Between Two Sets (HackerRank)

    You are given two arrays of integers:
        A (size n)
        B (size m)

    Your task is to find how many integers (x) satisfy BOTH conditions:

        1. Every element in array A is a factor of x.
           (x must be divisible by all elements of A)

        2. x is a factor of every element in array B.
           (x must divide all elements of B)

    In simpler terms:
        For a number x to be valid:
            A[i] divides x for all i
            x divides B[j] for all j

    Approach Insight:

        • Any valid x must be:
              - A multiple of LCM(A)
              - A divisor of GCD(B)

        • So the problem reduces to:
              1. Find LCM of all elements in A.
              2. Find GCD of all elements in B.
              3. Count how many multiples of LCM(A)
                 evenly divide GCD(B).

    If LCM(A) > GCD(B),
        then no such integer exists.

    Output:
        Return the count of all integers that satisfy
        both given conditions.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Resulter {

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        // Step 1: Compute LCM of array A
        int lcmA = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            int x = lcmA;
            int y = a.get(i);

            // GCD calculation (inside)
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }

            int gcd = x;
            lcmA = (lcmA / gcd) * a.get(i);
        }

        // Step 2: Compute GCD of array B
        int gcdB = b.get(0);
        for (int i = 1; i < b.size(); i++) {
            int x = gcdB;
            int y = b.get(i);

            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }

            gcdB = x;
        }

        // Step 3: Count valid numbers
        int count = 0;
        for (int i = lcmA; i <= gcdB; i += lcmA) {
            if (gcdB % i == 0) {
                count++;
            }
        }

        return count;
    }
}

public class Between_Two_Sets {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // size of array A
        int m = sc.nextInt();   // size of array B

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        // Input array A
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        // Input array B
        for (int i = 0; i < m; i++) {
            b.add(sc.nextInt());
        }

        int result = Resulter.getTotalX(a, b);
        System.out.println(result);

        sc.close();
    }
}
