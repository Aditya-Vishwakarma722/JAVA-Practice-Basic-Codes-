/*
    Problem: Find Digits

    Given an integer n, count how many of its digits evenly divide n.

    A digit is considered valid if:
        - It is not zero.
        - n % digit == 0 (the digit divides n exactly).

    You must examine each digit of the number individually
    and count how many satisfy the condition.

    Important:
        - If a digit is 0, ignore it (division by zero is undefined).
        - Use the original number for division checks.
        - Extract digits using modulus (%) and division (/ 10).

    Example 1:
        Input:  n = 12
        Digits: 1, 2
        12 % 1 = 0  → valid
        12 % 2 = 0  → valid
        Output: 2

    Example 2:
        Input:  n = 1012
        Digits: 1, 0, 1, 2
        1012 % 1 = 0  → valid
        0 → ignore
        1012 % 1 = 0  → valid
        1012 % 2 = 0  → valid
        Output: 3

    Approach:
        1. Store original number.
        2. Extract digits one by one using n % 10.
        3. Check:
              if digit != 0 AND original % digit == 0
                 increase count.
        4. Remove last digit using n /= 10.
        5. Continue until n becomes 0.

    Time Complexity:
        O(d), where d = number of digits in n.

    Space Complexity:
        O(1)
*/

import java.util.Scanner;

class numsOfDigit{
    int digitCount(int n){
        int count = 0;
        int original = n;
        while(n!=0){
            int digit = n%10;
            if(digit!=0 && original%digit == 0) count++;
            n/=10;
        }
        return count;
    }
}

public class Find_Digits {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        numsOfDigit nums = new numsOfDigit();
        System.out.println(nums.digitCount(n));
    }
}
