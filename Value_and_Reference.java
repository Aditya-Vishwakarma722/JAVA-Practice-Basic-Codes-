public class Value_and_Reference {

    static void changing(int number){
        number = 29;
        System.out.println("Value of num inside Method : "+number);
    }

    static void changing2(int [] ar){
        ar[4] = 90;
        System.out.println("Value of arr[4] inside Method : "+ar[4]);
    }


    public static void main(String[] args){

        int num = 43;
        System.out.println("Original Value of num : "+num);
        changing(num);
        System.out.println("Value of num after using Method : "+num);
        System.out.println("\n");

        int [] arr = {10,20,30,40,50,60};
        System.out.println("Original Value of array element [4] : "+arr[4]);
        changing2(arr);
        System.out.println("Value of arr[4] after using Method : "+arr[4]);
        System.out.println("\n");

        System.out.println("New Elements of the Array :");
        for(int i = 0 ; i<6 ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
