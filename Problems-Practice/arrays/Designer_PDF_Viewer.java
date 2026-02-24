/*
 * Designer PDF Viewer (HackerRank)
 *
 * When a word is highlighted in a PDF viewer, a rectangular area is formed.
 *
 * Each lowercase English letter ('a' to 'z') has a specific height.
 * You are given:
 *
 *   h    -> a list of 26 integers where:
 *           h[0] represents the height of 'a'
 *           h[1] represents the height of 'b'
 *           ...
 *           h[25] represents the height of 'z'
 *
 *   word -> a string consisting only of lowercase English letters
 *
 * Rules:
 *   - Each letter has a width of 1 unit.
 *   - The height of the highlighted rectangle is determined by
 *     the tallest letter in the given word.
 *   - The width of the highlighted rectangle is equal to
 *     the number of letters in the word.
 *
 * Task:
 *   Calculate and return the area of the highlighted rectangle.
 *
 * Formula:
 *   Area = (maximum letter height in the word) × (length of the word)
 *
 * Constraints:
 *   - 1 <= word.length() <= 10
 *   - 1 <= h[i] <= 7
 *
 * Example:
 *   Input:
 *     h = [1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7]
 *     word = "zaba"
 *
 *   Explanation:
 *     Heights:
 *       'z' = 7
 *       'a' = 1
 *       'b' = 3
 *       'a' = 1
 *
 *     Tallest letter = 7
 *     Word length = 4
 *
 *     Area = 7 × 4 = 28
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class frequency{
    public int viewerDesigner(List<Integer> h, String word){
        int maxCount = 0;
        for(int i=0 ; i<word.length() ; i++){
            int curr = (int) word.charAt(i) - 'a';
            int num = h.get(curr);
            if(num>maxCount) maxCount = num;
        }
        return maxCount*word.length();
    }
}

public class Designer_PDF_Viewer {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        List<Integer> h = new ArrayList<>();
        for(int i=0 ; i<26 ; i++){
            h.add(scn.nextInt());
        }
        scn.nextLine();
        String word = scn.nextLine();
        frequency fqr = new frequency();
        System.out.println(fqr.viewerDesigner(h, word));
    }
}
