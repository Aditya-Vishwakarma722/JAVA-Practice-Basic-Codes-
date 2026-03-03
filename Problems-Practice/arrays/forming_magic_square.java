import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class magicSquareConverter{
    public int converter(List<List<Integer>> arr){
        int[][][] magicSquares = {
                {
                        {8,1,6},
                        {3,5,7},
                        {4,9,2}
                },
                {
                        {6,1,8},
                        {7,5,3},
                        {2,9,4}
                },
                {
                        {4,9,2},
                        {3,5,7},
                        {8,1,6}
                },
                {
                        {2,9,4},
                        {7,5,3},
                        {6,1,8}
                },
                {
                        {8,3,4},
                        {1,5,9},
                        {6,7,2}
                },
                {
                        {4,3,8},
                        {9,5,1},
                        {2,7,6}
                },
                {
                        {6,7,2},
                        {1,5,9},
                        {8,3,4}
                },
                {
                        {2,7,6},
                        {9,5,1},
                        {4,3,8}
                }
        };

        int minCost = Integer.MAX_VALUE;

        for(int k=0 ; k<8 ; k++){
            int cost = 0;
            for(int i=0 ; i<3 ; i++){
                for(int j=0 ; j<3 ; j++){
                    int val = arr.get(i).get(j);
                    cost+=Math.abs(val - magicSquares[k][i][j]);
                }
            }
            minCost = Math.min(minCost, cost);
        }
        return minCost;
    }
}

public class forming_magic_square {
    public static void main(String [] args){
        Scanner scn = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i=0 ; i<3 ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0 ; j<3 ; j++){
                row.add(scn.nextInt());
            }
            arr.add(row);
        }

        magicSquareConverter mgc = new magicSquareConverter();
        System.out.println(mgc.converter(arr));
    }
}
