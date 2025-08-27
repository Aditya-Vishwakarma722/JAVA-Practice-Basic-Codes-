public class Method_Overloading {

    /*
    METHOD 1 :-
    static int sum(int a ,int b){
        return a+b;
    }

    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static int sum(int a, int b, int c, int d){
        return a+b+c+d;
    }
     */

    //METHOD 2 :-
    static int sum(int ...arr){
        int add = 0;
        for(int a: arr){
            add+=a;
        }
        return add;
    }


    public static void main(String[] args){
        System.out.println("Sum [a+b] = "+sum(10,20));
        System.out.println("Sum [a+b+c] = "+sum(10,20,30));
        System.out.println("Sum [a+b+c+d] = "+sum(10,20,30,40));
    }
}
