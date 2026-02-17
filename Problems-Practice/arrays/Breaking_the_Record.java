/*
 * Problem: Breaking the Records
 *
 * Maria is playing a season of games and wants to track her performance.
 * She records her score after each game.
 *
 * Initially, her first game score sets both:
 * - The highest record
 * - The lowest record
 *
 * For each subsequent game:
 * - If her score is strictly greater than her highest score so far,
 *   she breaks her highest record.
 * - If her score is strictly lower than her lowest score so far,
 *   she breaks her lowest record.
 *
 * Task:
 * Count how many times she breaks her highest record
 * and how many times she breaks her lowest record.
 *
 * Return:
 * A list containing two integers:
 * [number_of_times_highest_record_broken,
 *  number_of_times_lowest_record_broken]
 *
 * Example:
 * scores = [10, 5, 20, 20, 4, 5, 2, 25, 1]
 *
 * Output:
 * [2, 4]
 *
 * Explanation:
 * Highest record broken 2 times.
 * Lowest record broken 4 times.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class records{
    public List<Integer> calculator(List<Integer> grades){
        int max = grades.get(0);
        int min = grades.get(0);
        int maxcount=0;
        int mincount=0;
        List<Integer> res = new ArrayList<>();

        for(int num:grades){
            if(num<min){
                min = num;
                mincount++;
            }
            else if(num>max){
                max = num;
                maxcount++;
            }
        }

        res.add(maxcount);
        res.add(mincount);
        return res;
    }
}

public class Breaking_the_Record {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        records rcd = new records();
        List<Integer> scores = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int size = scn.nextInt();
        for(int i=0 ; i<size ; i++){
            scores.add(scn.nextInt());
        }

        res = rcd.calculator(scores);

        for(int i : res){
            System.out.print(i+"\t");
        }

    }
}
