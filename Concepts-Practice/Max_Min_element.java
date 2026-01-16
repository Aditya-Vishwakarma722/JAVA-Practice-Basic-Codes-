import java.util.Scanner;

public class Max_Min_element {
    public static void main(String[] args){
        int size;
        int max;
        int min;
        int [] arr;
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        size = scn.nextInt();

        arr = new int[size];

        for(int i = 0 ; i<size ; i++){
            System.out.print("Enter the Element [" +(i+1)+ "] : ");
            arr[i] = scn.nextInt();
        }
        
        max =arr[0];
        min = arr[0];

        for(int i = 0 ; i<size ; i++){
            if(arr[i]<min){
                min = arr[i];
            }

            else if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);

    }
}
