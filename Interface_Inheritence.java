interface sample1{
    void method1();
    void method2();
}

interface sampleChild extends sample1{
    int cal1(int a,int b);
    int cal2(int x, int y);
}

class result implements sampleChild{
    public void method1(){
        System.out.println("This is 1st Method in Sample Interface!");
    }

    public void method2(){
        System.out.println("This is 2nd Method in Sample Interface!");
    }

    public int cal1(int a, int b){
        return a+b;
    }

    public int cal2(int x, int y){
        return x*y;
    }

}

public class Interface_Inheritence {
    public static void main(String[] args){
        result res = new result();
        res.method1();
        res.method2();
        System.out.println(res.cal1(20,30));
        System.out.println(res.cal2(20,30));
    }
}
