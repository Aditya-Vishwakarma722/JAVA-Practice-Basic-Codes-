import java.util.Scanner;

public class Array_reverse {
    public static void main(String[] args){
        int [] arr;
        int [] rev;
        int size;

        Scanner sscn = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        size = sscn.nextInt();

        arr = new int[size];
        rev = new int[size];

        for(int i = 0 ; i<size ; i++){
            System.out.print("Enter element ["+(i+1)+"] : ");
            arr[i] = sscn.nextInt();
        }

        for(int i = 0 ; i<size ; i++){
            rev[i] = arr[size-1-i];
        }

        System.out.println("Original Matrix : ");
        for(int i = 0 ; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(' ');

        System.out.println("Reversed Matrix : ");
        for(int i = 0 ; i<size ; i++){
            System.out.print(rev[i]+" ");
        }
    }
}
