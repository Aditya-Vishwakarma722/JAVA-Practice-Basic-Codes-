/*
 * Problem: Grading Students (HackerRank)
 *
 * HackerLand University has the following grading policy:
 *
 * - Every student receives a grade between 0 and 100.
 * - Any grade less than 38 is considered failing.
 * - If the grade is 38 or higher, it may be rounded up.
 * - A grade is rounded up to the next multiple of 5
 *   if the difference between the grade and the next multiple
 *   of 5 is less than 3.
 *
 * - If the difference is 3 or more, no rounding occurs.
 *
 * Task:
 * Given a list of grades, return a new list where each grade
 * is adjusted according to the rounding policy.
 *
 * Example:
 * Input:  [73, 67, 38, 33]
 * Output: [75, 67, 40, 33]
 *
 * Explanation:
 * 73 → Next multiple is 75 (difference = 2) → round to 75
 * 67 → Next multiple is 70 (difference = 3) → do not round
 * 38 → Next multiple is 40 (difference = 2) → round to 40
 * 33 → Below 38 → do not round
 *
 * Approach:
 * - Iterate through each grade.
 * - If grade >= 38:
 *     - Find remainder when divided by 5.
 *     - If remainder >= 3, add (5 - remainder) to round up.
 * - Add the adjusted grade to result list.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class solver{
    public void calculator(List<Integer> grades){
        List<Integer> result = new ArrayList<>();
        int size = grades.size();
        for(int i=0 ; i<size ; i++){
            int num = grades.get(i);
            if(num >= 38) {
                int div = num%5;
                if(num >= 3){
                    result.add(num+(5-div));
                }
                else{
                    result.add(num);
                }
            }
            else{
                result.add(num);
            }
        }

        for(int num : result){
            System.out.println(num);
        }
    }
}

public class Grading_Students {
    public static void main(String [] args){
        solver sc = new solver();
        Scanner scn = new Scanner(System.in);
        List<Integer> grades = new ArrayList<>();
        int size = scn.nextInt();
        for(int i=0 ; i<size ; i++){
            grades.add(scn.nextInt());
        }

        sc.calculator(grades);
    }
}
