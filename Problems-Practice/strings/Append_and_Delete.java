/*
    Problem: Append and Delete (HackerRank)

    You are given two strings:
        s → initial string
        t → target string
    And an integer k → exact number of operations allowed.

    Allowed Operations:
        1. Append a lowercase character to the end of the string.
        2. Delete the last character of the string.

    Goal:
        Determine whether it is possible to convert string s into string t
        using exactly k operations.

    Important Conditions:
        - You must perform exactly k operations (not less, not more).
        - Deleting an empty string is allowed (it remains empty).

    Key Idea:
        1. Find the longest common prefix of s and t.
        2. Delete the remaining unmatched characters from s.
        3. Append the remaining characters needed to form t.
        4. Calculate the minimum operations required:
               minOperations = deletions + additions
        5. Check:
            - If k < minOperations → return "No"
            - If k >= s.length() + t.length() → return "Yes"
              (delete entire s and rebuild t, extra moves can be wasted)
            - If (k - minOperations) is even → return "Yes"
              (extra operations can be wasted in delete-append pairs)
            - Otherwise → return "No"

    Output:
        Return "Yes" if transformation is possible.
        Otherwise, return "No".
*/

import java.util.Scanner;

class operations{
    public String countOperations(String s, String t, int k){
        int commonLength = 0;
        int minLength = Math.min(s.length(), t.length());
        for(int i=0 ; i<minLength ; i++){
            if(s.charAt(i) == t.charAt(i)) commonLength++;
            else break;
        }

        int deletion = s.length() - commonLength;
        int append = t.length() - commonLength;
        int totalOperations = deletion + append;

        if(k<totalOperations) return "No";
        else if(k>= s.length()+t.length()) return "Yes";
        else if((k-totalOperations)%2==0) return "Yes";
        return "No";
    }
}

public class Append_and_Delete {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        int k = scn.nextInt();
        operations operate = new operations();
        System.out.println(operate.countOperations(s,t,k));
    }
}
