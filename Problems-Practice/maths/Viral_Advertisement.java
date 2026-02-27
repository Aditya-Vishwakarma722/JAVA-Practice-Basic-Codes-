/*
    Viral Advertising - HackerRank

    HackerLand Enterprise advertises its new product using a viral marketing strategy.

    On Day 1:
        - The advertisement is shared with 5 people.
        - Each person shares the ad with 3 new people the next day.
        - Only half of the people who receive the ad (floor division) like it.
        - Each person who likes the ad shares it with 3 new people the following day.

    This process continues for n days.

    Rules:
        1. On each day:
            - Calculate how many people like the ad:
                  liked = shared / 2
            - Add liked to total cumulative likes.
            - Next day's shared = liked * 3

    Given:
        n -> number of days

    Task:
        Return the cumulative number of likes after n days.

    Function Signature:
        public static int viralAdvertising(int n)

    Example:
        Input:
            n = 3

        Day 1:
            Shared = 5
            Liked = 5 / 2 = 2
            Cumulative = 2
            Next Shared = 2 * 3 = 6

        Day 2:
            Shared = 6
            Liked = 6 / 2 = 3
            Cumulative = 2 + 3 = 5
            Next Shared = 3 * 3 = 9

        Day 3:
            Shared = 9
            Liked = 9 / 2 = 4
            Cumulative = 5 + 4 = 9

        Output:
            9

    Constraints:
        1 ≤ n ≤ 50
*/

import java.util.Scanner;

class LikesCount{
    int counter(int n){
        int people = 5;
        int totalLikes = 0;
        for(int i=1 ; i<=n ; i++){
            int recipient = people/2;
            totalLikes+=recipient;
            people = recipient*3;
        }
        return totalLikes;
    }
}

public class Viral_Advertisement {
    public static void main(String [] agrs){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        LikesCount lk = new LikesCount();
        System.out.println(lk.counter(n));
    }
}
