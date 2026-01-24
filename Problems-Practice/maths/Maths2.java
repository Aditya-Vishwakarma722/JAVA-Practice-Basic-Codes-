/*
Second Max of Three Numbers -

Problem Statement:
Write a program that accepts sets of three numbers, and prints the second-maximum number among the three.

Input:
First line contains the number of triples, N.
The next N lines which follow each have three space separated integers.

Output
For each of the N triples, output one new line which contains the second-maximum integer among the three.

Constraints
1 ≤ N ≤ 6
1 ≤ every integer ≤ 10000
The three integers in a single triplet are all distinct. That is, no two of them are equal.

 */

import java.util.Scanner;

public class Maths2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for(int i=0 ; i<N ; i++){
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = scn.nextInt();
            if((x>y && x<z) || (x>z && x<y)){System.out.println(x);}
            else if((y>x && y<z) || (y>z && y<x)){System.out.println(y);}
            else{System.out.println(z);}
        }
    }
}
