/*
 * Angry Professor (HackerRank)
 *
 * A professor decides to cancel a class if fewer than a certain number
 * of students are present on time.
 *
 * Given:
 *   k -> the cancellation threshold (minimum number of students required)
 *   a -> an array of integers representing arrival times of students
 *
 * Rules:
 *   - If a student's arrival time is <= 0, the student is on time.
 *   - If a student's arrival time is > 0, the student is late.
 *
 * Task:
 *   Determine whether the class is cancelled.
 *
 * Return:
 *   - "YES" if the class is cancelled
 *   - "NO"  if the class is NOT cancelled
 *
 * Cancellation Condition:
 *   If the number of students who arrived on time is less than k,
 *   the class is cancelled.
 *
 * Constraints:
 *   - 1 <= number of students <= 1000
 *   - -100 <= arrival time <= 100
 *
 * Example 1:
 *   Input:
 *     k = 3
 *     a = [-1, -3, 4, 2]
 *
 *   On-time students = 2
 *   Since 2 < 3, class is cancelled.
 *
 *   Output: "YES"
 *
 * Example 2:
 *   Input:
 *     k = 2
 *     a = [0, -1, 2, 1]
 *
 *   On-time students = 2
 *   Since 2 >= 2, class is NOT cancelled.
 *
 *   Output: "NO"
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class studentCheck{
    public String classStatus(int k, List<Integer> a){
        int early = 0;
        int late = 0;
        for(int i=0 ; i<a.size() ; i++){
            if(a.get(i)<=0) early++;
            else late++;
        }
        if(early<k) return "YES";
        else return "NO";
    }
}

public class Angry_Teacher {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        List<Integer> arr = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            arr.add(scn.nextInt());
        }

        studentCheck std = new studentCheck();
        System.out.println(std.classStatus(k, arr));
    }
}
