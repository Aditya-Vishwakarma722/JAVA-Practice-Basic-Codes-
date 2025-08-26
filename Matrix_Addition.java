import java.util.Scanner;

public class Matrix_Addition {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int [][] arr1;
        int  [][]arr2;
        int [][] arr3;

        System.out.println("Matrix Multiplication : \n");

        System.out.println("MATRIX - 1 : ");
        System.out.print("Enter number of rows : ");
        int rows1 = scn.nextInt();
        System.out.print("Enter number of columns : ");
        int col1 = scn.nextInt();

        System.out.print("\n");

        System.out.println("MATRIX - 2 : ");
        System.out.print("Enter number of rows : ");
        int rows2 = scn.nextInt();
        System.out.print("Enter number of columns : ");
        int col2 = scn.nextInt();

        System.out.print("\n");

        arr1 = new int[rows1][col1];
        arr2 = new int[rows2][col2];
        arr3 = new int[rows1][col1];

        if(rows1 != rows2 || col1 != col2){
            System.out.println("Both Matrices sohuld have same rows and columns!");
        }
        else{
            System.out.println("Enter the elements of Matrix - 1 :");
            for(int i = 0 ; i<rows1 ; i++){
                for(int j = 0 ; j<col1 ; j++){
                    System.out.print("Enter Element ["+(i+1)+"]["+(j+1)+"] : ");
                    arr1[i][j] = scn.nextInt();
                }
            }

            System.out.print("\n");

            System.out.println("Enter the elements of Matrix - 2 :");
            for(int i = 0 ; i<rows2 ; i++){
                for(int j = 0 ; j<col2 ; j++){
                    System.out.print("Enter Element ["+(i+1)+"]["+(j+1)+"] : ");
                    arr2[i][j] = scn.nextInt();
                }
            }


            for(int i = 0 ; i<rows1 ; i++){
                for(int j = 0 ; j<col1 ; j++){
                    arr3[i][j] = arr1[i][j] + arr2[i][j];
                }
            }

            System.out.println("Resultant Matrix : ");
            for(int i = 0 ; i<rows1 ; i++){
                for(int j = 0 ; j<col1 ; j++){
                    System.out.print(arr3[i][j]+"  ");
                }
                System.out.print("\n");
            }
        }

    }
}
