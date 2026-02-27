/*
    Save The Prisoner - HackerRank

    A jail has n prisoners sitting in a circle and numbered from 1 to n.

    There are m sweets to distribute.
    The distribution starts at chair number s.
    The sweets are handed out one by one to consecutive prisoners
    in increasing order of their chair numbers.

    The distribution wraps around to chair 1 after chair n.

    The last sweet is poisoned.

    Task:
        Determine which prisoner will receive the last (poisoned) sweet.

    Given:
        n -> total number of prisoners
        m -> total number of sweets
        s -> starting chair number

    Rules:
        - First sweet goes to prisoner s.
        - Next sweet goes to s + 1.
        - Continue in order.
        - After reaching prisoner n, continue from prisoner 1.
        - Return the chair number of the prisoner who gets the last sweet.

    Function Signature:
        public static int saveThePrisoner(int n, int m, int s)

    Example:
        Input:
            n = 5
            m = 2
            s = 1

        Distribution:
            Sweet 1 -> Prisoner 1
            Sweet 2 -> Prisoner 2

        Output:
            2

    Constraints:
        1 ≤ n ≤ 10^5
        1 ≤ m ≤ 10^9
        1 ≤ s ≤ n
*/

import java.util.Scanner;

class saveHim{
    int circular(int n, int m, int s){
        int res = (s+m-1)%n;
        if(res==0) return n;
        else return res;
    }
}

public class SaveThePrisoner {
    static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int s = scn.nextInt();
        saveHim svm = new saveHim();
        System.out.println(svm.circular(n,m,s));
    }
}
