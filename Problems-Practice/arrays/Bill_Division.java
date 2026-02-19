/*
 * Bill Division - HackerRank
 *
 * Anna and Brian go to a restaurant and order several items.
 * The cost of each item is given in a list called 'bill'.
 *
 * Anna does not eat the item at index 'k'.
 * Brian calculates the total bill and charges Anna an amount 'b'.
 *
 * Task:
 * Determine whether Brian charged Anna the correct amount.
 *
 * Steps:
 * 1. Exclude the item at index 'k' from the total bill.
 * 2. Divide the remaining total by 2 to get Anna's fair share.
 * 3. If Brian charged correctly, print "Bon Appetit".
 * 4. If he overcharged, print the difference (b - fair share).
 *
 * Constraints:
 * - bill contains the cost of each item.
 * - k is a valid index in the list.
 * - b is the amount Brian charged Anna.
 *
 * Output:
 * Print "Bon Appetit" if the charge is correct,
 * otherwise print the overcharged amount.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class billCheck{
    public void cal(List<Integer> bill, int k, int b){
        int sum = 0;
        for(int i=0 ; i<bill.size() ; i++){
            if(i!=k){
                sum+=bill.get(i);
            }
        }
        int actual = sum/2;
        if(actual==b){
            System.out.println("Bon Appetit");
        }
        else{
            int res = b-actual;
            System.out.println(res);
        }
    }
}

public class Bill_Division {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        List<Integer> bill = new ArrayList<>();
        int n = scn.nextInt();
        int k = scn.nextInt();
        for(int i=0 ; i<n ; i++){
            bill.add(scn.nextInt());
        }
        int b = scn.nextInt();
        billCheck bk = new billCheck();
        bk.cal(bill,k,b);
    }
}
