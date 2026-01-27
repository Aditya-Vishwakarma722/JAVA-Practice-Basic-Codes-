/*
Integers that sum to the same value:
Alice has a positive integer N. She is wondering how many ordered pairs of positive integers (i,j) exist such that i+j=N.
Help Alice figure out the answer.

Note that since the pairs are ordered, (1,2) and (2,1) are considered different.
Note that 0 is not considered to be a positive integer.

Input Format:
The first and only line of input contains a single integer N.

Output Format:
Print a single integer, the number of ordered pairs of positive integers (i,j) such that i+j=N.
 */

import java.util.Scanner;

public class Maths12 {
    public static void main(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num = 0;
        for(int i=1 ; i<n ; i++){
            for(int j=1 ; j<n ; j++){
                if(i+j == n){
                    num++;
                }
            }
        }
        System.out.println(num);
    }
}
