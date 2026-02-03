class test1{
    private int term1;
    private String term2;

    public void setTerm1(int numb){
        this.term1 = numb;
    }
    public void setTerm2(String name){
        this.term2 = name;
    }
    int getTerm1(){
        return term1;
    }
    String getTerm2(){
        return term2;
    }
}

public class PracticeLesson {
    public static void main(String[] args){
        test1 ts = new test1();
        ts.setTerm1(451);
        ts.setTerm2("Aditya");

        System.out.println("Roll No. - "+ts.getTerm1());
        System.out.println("Name - "+ts.getTerm2());
    }
}
