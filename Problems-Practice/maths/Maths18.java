/*
Farmer And His Plot:
Santosh has a farm at Byteland. He has a very big family to look after. His life takes a sudden turn and
he runs into a financial crisis. After giving all the money he has in his hand, he decides to sell his plots.
The speciality of his land is that it is rectangular in nature. Santosh comes to know that he will get more money
if he sells square shaped plots. So keeping this in mind, he decides to divide his land into minimum possible number of square plots,
such that each plot has the same area, and the plots divide the land perfectly. He does this in order to get the maximum profit out of this.
So your task is to find the minimum number of square plots with the same area, that can be formed out of the rectangular land,
such that they divide it perfectly.

Input Format:
The first line of the input contains T, the number of test cases. Then T lines follow.
The first and only line of each test case contains two space-separated integers, N and M,
the length and the breadth of the land, respectively.

Output Format:
For each test case, print the minimum number of square plots with equal area, such that they divide the farm land perfectly, in a new line.
*/

// Valuable Info :-
//GCD = Minimum Number of Squares / Largest Squares
//(length/GCDVal) = no. of squares in row -- (bredth/GCDVal =  no. of squares in column

import java.util.Scanner;

public class Maths18 {
    public static long gcd(long a, long b){
        while(b!=0){
            long temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while(t-- >0){
            int a = scn.nextInt();
            int b = scn.nextInt();
            long g = gcd(a,b);
            long res = (a/g)*(b/g);
            System.out.println(res);
        }
    }
}
