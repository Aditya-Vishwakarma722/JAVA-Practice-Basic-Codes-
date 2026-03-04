/*
    Problem: Sequence Equation

    You are given a permutation p of integers from 1 to n.
    A permutation means:
        - Each number from 1 to n appears exactly once.
        - No duplicates.
        - All values are within the range [1, n].

    For each integer x from 1 to n, find an integer y such that:

            p(p(y)) = x

    In simple terms:
        1. Find the index where value x appears in the array p.
        2. Then find the index where that index value appears in p.
        3. Print that second index.

    Important:
        - Indexing is 1-based (as per problem statement).
        - Output each y on a new line.

    Example:
        Input:
            n = 3
            p = [2, 3, 1]

        Process:
            For x = 1:
                position of 1 = 3
                position of 3 = 2
                Output = 2

            For x = 2:
                position of 2 = 1
                position of 1 = 3
                Output = 3

            For x = 3:
                position of 3 = 2
                position of 2 = 1
                Output = 1

        Final Output:
            2
            3
            1

    Efficient Approach:
        - Create an auxiliary array "position"
          where position[value] = index of that value.
        - Then for each x:
              y = position[position[x]]

    Time Complexity:
        O(n)

    Space Complexity:
        O(n)
*/

import java.util.*;

class Solution {

    public static List<Integer> permutationEquation(List<Integer> p) {

        int n = p.size();

        // position[value] = index of that value (1-based indexing)
        int[] position = new int[n + 1];

        // Build position array
        for (int i = 0; i < n; i++) {
            position[p.get(i)] = i + 1;
        }

        List<Integer> result = new ArrayList<>();

        // For each x from 1 to n
        for (int x = 1; x <= n; x++) {
            int pos1 = position[x];        // first lookup
            int pos2 = position[pos1];     // second lookup
            result.add(pos2);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        List<Integer> answer = permutationEquation(p);

        for (int val : answer) {
            System.out.println(val);
        }

        sc.close();
    }
}

public class Sequence_Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        List<Integer> result = Solution.permutationEquation(p);

        for (int value : result) {
            System.out.println(value);
        }

        sc.close();
    }
}
