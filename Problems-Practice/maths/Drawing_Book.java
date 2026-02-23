/*
 * Drawing Book Problem (HackerRank)
 *
 * A teacher asks the class to open their books to a certain page number.
 * The book has 'n' pages numbered from 1 to n.
 *
 * The book can be opened from either:
 *   1) The front (starting at page 1)
 *   2) The back (starting at page n)
 *
 * Each page turn flips two pages at a time.
 * For example:
 *   Turn 0 -> Page 1
 *   Turn 1 -> Pages 2 and 3
 *   Turn 2 -> Pages 4 and 5
 *   Turn 3 -> Pages 6 and 7
 *   ...
 *
 * Given:
 *   n -> total number of pages in the book
 *   p -> target page number to turn to
 *
 * Task:
 *   Determine the minimum number of page turns required
 *   to reach page 'p' starting from either the front or the back.
 *
 * Return:
 *   An integer representing the minimum number of page turns.
 *
 * Constraints:
 *   - 1 <= n <= 10^5
 *   - 1 <= p <= n
 *
 * Example:
 *   Input:  n = 6, p = 2
 *   Output: 1
 *
 * Explanation:
 *   From front -> 1 turn
 *   From back  -> 2 turns
 *   Minimum = 1
 */

import java.util.Scanner;

class pagescheck{
    public int pages(int n, int p){
        int front = p/2;
        int back = n/2-p/2;
        if(front<back) return front;
        else return back;
    }
}

public class Drawing_Book {
    static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        pagescheck pg = new pagescheck();
        System.out.println(pg.pages(n,p));
    }
}
