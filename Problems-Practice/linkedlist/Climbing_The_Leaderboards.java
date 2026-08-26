/*
    Problem: Climbing the Leaderboard

    You are given an existing leaderboard with scores in descending order.
    The leaderboard uses DENSE RANKING:

        - Players with equal scores share the same rank.
        - The next distinct score gets the next immediate rank.

    Example:
        Scores: 100, 100, 50, 40, 40, 20, 10
        Ranks :   1    1    2   3    3   4   5

    A new player (Alice) plays multiple games.
    For each of Alice’s scores, determine her rank on the leaderboard.

    Input:
        ranked[]  -> existing leaderboard scores (descending order)
        player[]  -> Alice's scores (ascending order)

    Output:
        For each score in player[], return Alice’s rank.

    Constraints:
        - ranked is sorted in descending order.
        - player is sorted in ascending order.
        - Scores may contain duplicates.

    Efficient Approach (O(n + m)):

        1. Remove duplicate scores from ranked to form a unique score list.
           This simplifies rank calculation.

        2. Use a two-pointer technique:
            - Start pointer 'i' at the end of uniqueRanked.
            - For each player score:
                - Move pointer left while player score >= uniqueRanked[i].
                - Rank = i + 2.

        Why i + 2?
            - After the loop, 'i' points to the last score strictly greater
              than the player’s score.
            - Rank = (number of greater scores) + 1
            - number of greater scores = i + 1
            - So rank = (i + 1) + 1 = i + 2

    This avoids re-sorting and runs in linear time.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class leaderboards{
    public List<Integer> ranksForEach(List<Integer> ranked, List<Integer> player){
        List<Integer> UniqueRanked = new ArrayList<>();
        UniqueRanked.add(ranked.get(0));

        for(int i=1 ; i< ranked.size() ; i++){
            if(!ranked.get(i).equals(ranked.get(i-1))){
                UniqueRanked.add(ranked.get(i));
            }
        }

        int i = UniqueRanked.size() - 1;
        List<Integer> result = new ArrayList<>();

        for(int num : player){
            while(i>=0 && num>=UniqueRanked.get(i)){
                i--;
            }
            result.add(i+2);
        }
        return result;
    }
}

public class Climbing_The_Leaderboards {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        leaderboards ldb = new leaderboards();

        int n = scn.nextInt();
        List<Integer> ranked = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            ranked.add(scn.nextInt());
        }

        int m = scn.nextInt();
        List<Integer> player = new ArrayList<>();
        for(int i=0 ; i<m ; i++){
            player.add(scn.nextInt());
        }

        List<Integer> arr = ldb.ranksForEach(ranked, player);

        for(int num : arr){
            System.out.println(num);
        }

    }
}
