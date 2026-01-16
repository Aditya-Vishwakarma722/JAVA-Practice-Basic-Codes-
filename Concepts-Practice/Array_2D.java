import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int [][] arr;
        int rows, cols;

        System.out.print("Enter the no. of Rows : ");
        rows = scn.nextInt();
        System.out.print("Enter the no. of Columns : ");
        cols = scn.nextInt();

        arr = new int[rows][cols];

        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                System.out.print("Enter the element ["+(i)+"]["+(j)+"] : ");
                arr[i][j] = scn.nextInt();
            }
        }

        System.out.println("Given Matrix :");
        for(int i = 0 ; i<rows ; i++){
            for(int j = 0 ; j<cols ; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.print("\n");
        }

    }
}
