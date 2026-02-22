/*
 * Electronics Shop - HackerRank
 *
 * A person wants to buy one keyboard and one USB drive.
 * The goal is to spend as much money as possible without exceeding a given budget.
 *
 * You are given:
 * - An integer budget (total money available).
 * - An array of keyboard prices.
 * - An array of USB drive prices.
 *
 * Task:
 * Choose exactly one keyboard and one USB drive such that:
 * - The total cost is less than or equal to the budget.
 * - The total cost is as large as possible.
 *
 * If it is not possible to buy both items within the budget,
 * return -1.
 *
 * Example:
 * Budget = 60
 * Keyboards = [40, 50, 60]
 * Drives = [5, 8, 12]
 *
 * Possible combinations:
 * 40 + 5  = 45
 * 40 + 8  = 48
 * 40 + 12 = 52
 * 50 + 5  = 55
 * 50 + 8  = 58  ← maximum within budget
 * 50 + 12 = 62 (exceeds budget)
 * ...
 *
 * Output:
 * 58
 *
 * Constraints:
 * - Must buy exactly one keyboard and one drive.
 * - Cannot exceed the budget.
 * - Return -1 if no valid combination exists.
 */

import java.util.Scanner;
import java.util.Vector;

class getMoneySpent{
    int moneyUsed(Vector<Integer> keyboard, Vector<Integer> drives, int budget){
        int maxCount = -1;
        int KCount = keyboard.size();
        int DCount = drives.size();
        for(int i=0 ; i<KCount ; i++){
            for(int j=0 ; j<DCount ; j++){
                int amount = keyboard.get(i)+drives.get(j);
                if(amount<=budget){
                    if(amount>maxCount) maxCount = amount;
                }
            }
        }
        return maxCount;
    }
}

public class Electronics_Shop {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        getMoneySpent gtm = new getMoneySpent();
        int budget = scn.nextInt();
        int k = scn.nextInt();
        int d = scn.nextInt();
        Vector<Integer> keyboards = new Vector<>();
        Vector<Integer> drives = new Vector<>();
        for(int i=0; i<k ; i++){
            keyboards.add(scn.nextInt());
        }
        for(int i=0; i<d ; i++){
            drives.add(scn.nextInt());
        }
        System.out.println(gtm.moneyUsed(keyboards,drives,budget));
    }
}
