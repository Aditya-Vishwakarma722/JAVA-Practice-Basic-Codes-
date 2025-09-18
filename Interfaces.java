interface places{
    void India();
    void America();
    void Japan();
    void Russia();
}

interface questions{
    int add(int a , int b);
    int subract(int a , int b);
    int multiply(int a , int b);
    int divide(int a , int b);
}

class conditions implements places, questions{

    //From places Interface

    public void India(){
        System.out.println("India is a Developing Country! It has good relations with Japan & Russia.");
    }

    public void America(){
        System.out.println("America is Currently having bad relations with India and Russia.");
    }

    public void Japan(){
        System.out.println("Japan is Currently having a healthy relations with India.");
    }

    public void Russia(){
        System.out.println("Russia is also having a healthy relation with India.");
    }

    // From Questions Interface

    public int add(int a, int b){
        return a+b;
    }

    public int subract(int a, int b){
        return a-b;
    }

    public int multiply(int a, int b){
        return a*b;
    }

    public int divide(int a, int b){
        return a/b;
    }

}

public class Interfaces {
    public static void main(String[] arhs){
        conditions cnd = new conditions();
        cnd.India();
        cnd.America();
        cnd.Japan();
        cnd.Russia();

        int num1 = cnd.add(38,58);
        int num2 = cnd.subract(74,52);
        int num3 = cnd.multiply(37,62);
        int num4 = cnd.divide(932,16);

        System.out.println("Additon (38+58) : "+num1+"\nSubtraction (74-52) : "+num2+"\nMultiplication (37*62) : "+num3+"\nDivision (932/16) : "+num4);
    }
}
