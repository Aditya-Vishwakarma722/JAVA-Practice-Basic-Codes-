import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class diagonals {
    List<Integer> dia_diff(int[][] arr, int size) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < size; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][size-1-i];
        }
        int diff = Math.abs(sum1-sum2);

        List<Integer> result = new ArrayList<>();
        result.add(diff);
        result.add(sum1);
        result.add(sum2);

        return result;
    }

}

public class Diagonal_Difference {
    static void main() {
        Scanner scn = new Scanner(System.in);
        diagonals dg = new diagonals();

        System.out.print("Enter the Size of the Matrix : ");
        int size = scn.nextInt();

        int [][] arr  = new int[size][size];

        System.out.println("Enter Elements : ");
        for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j< size ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        List<Integer> answer = dg.dia_diff(arr,size);
        int ans1 = answer.getFirst();
        int ans2 = answer.get(1);
        int ans3 = answer.getLast();

        System.out.println("Diagonal Sum : "+ans2+"\nReverse Diagonal Sum : "+ans3+"\nDifference : "+ans1);

    }
}
