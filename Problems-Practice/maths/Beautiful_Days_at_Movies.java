/*
    Beautiful Days at the Movies - HackerRank

    Lily likes to go to the movies very much. She defines a beautiful day as:

    A day between i and j (inclusive) is beautiful if:
    1. Reverse the digits of the day number.
    2. Find the absolute difference between the original day and the reversed day.
    3. If that difference is evenly divisible by k, then the day is considered beautiful.

    Given three integers:
        i -> starting day number
        j -> ending day number
        k -> divisor

    Task:
        Return the number of beautiful days in the range [i, j].

    Function Signature:
        public static int beautifulDays(int i, int j, int k)

    Example:
        Input:
            i = 20
            j = 23
            k = 6

        Days:
            20 -> reverse = 02 (2) -> |20 - 2| = 18 -> 18 % 6 == 0 -> beautiful
            21 -> reverse = 12 -> |21 - 12| = 9 -> 9 % 6 != 0 -> not beautiful
            22 -> reverse = 22 -> |22 - 22| = 0 -> 0 % 6 == 0 -> beautiful
            23 -> reverse = 32 -> |23 - 32| = 9 -> 9 % 6 != 0 -> not beautiful

        Output:
            2

    Constraints:
        1 ≤ i ≤ j ≤ 2 * 10^6
        1 ≤ k ≤ 2 * 10^9
*/

import java.util.*;

public class Beautiful_Days_at_Movies{

    public static int beautifulDays(int i, int j, int k) {
        int days = 0;

        for (int x = i; x <= j; x++) {
            int original = x;
            int reversed = 0;

            int temp = x;
            while (temp != 0) {
                reversed = reversed * 10 + temp % 10;
                temp /= 10;
            }

            int diff = Math.abs(original - reversed);

            if (diff % k == 0) {
                days++;
            }
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int result = beautifulDays(i, j, k);
        System.out.println(result);

        sc.close();
    }
}