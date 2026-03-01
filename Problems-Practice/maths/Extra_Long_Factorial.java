/*
Problem: Extra Long Factorials

You are given an integer n. Your task is to calculate n! (n factorial).

Factorial of a number n is defined as:
n! = n × (n-1) × (n-2) × ... × 1

For example:
5! = 5 × 4 × 3 × 2 × 1 = 120

However, for large values of n (like 25, 50, or 100),
the factorial value becomes extremely large and cannot
be stored using standard data types like int or long.

Therefore, you must handle very large numbers properly.

Input:
- A single integer n

Output:
- Print the value of n!

Constraints:
- 1 ≤ n ≤ 100

Note:
- The result may contain more digits than standard
  integer types can handle.
- In Java, BigInteger should be used to store large values.

Example:

Input:
25

Output:
15511210043330985984000000
*/

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

class factorial{
    public void valueOf(int n){
        BigInteger factorial = BigInteger.ONE;
        for(int i=1 ; i<=n ; i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}

public class Extra_Long_Factorial {
    static void main(String [] agrs){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        factorial fct = new factorial();
        fct.valueOf(n);
    }
}
