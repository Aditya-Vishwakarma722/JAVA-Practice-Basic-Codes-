public class Pattern_Printing {
    public static void main(String [] agrs){
        int N = 10;
        for(int i = 0 ; i < N ; i++){
            for(int j = 0 ; j<N ; j++){
                if(i == 0 || j == 0 || i == N-1 || j == N-1){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for(int i = 0 ; i <N ; i++){
            for(int j = 0 ; j<i+1 ; j++){
                System.out.print("$");
            }
            System.out.print("\n");
        }

        int num = 1;
        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<i+1 ; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.print("\n");
        }

        System.out.println(" ");

        int num2 = 10;
        for(int i = 0 ;i<N ; i++){
            for(int j = 0 ; j<i+1 ; j++){
                if(i>=j){
                    System.out.print(num2+" ");
                    num2+=1;
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for(int i = 0 ; i<N ; i++){
            int k = i+1,d = N-1;
            for(int j = 0 ; j<=i ; j++){
                System.out.print(k+" ");
                k+=d;
                d--;
            }
            System.out.println(" ");
        }

        int [][] mat = new int[N][N];
        int k = 1;
        for(int i = 0 ; i<N ; i++){
            for(int j = i ; j<N ; j++){
                mat[i][j] = k;
                k+=1;
            }
            System.out.println(" ");
        }
        for(int i = 0 ; i<N ; i++){
            for(int j = 0 ; j<i+1 ; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
