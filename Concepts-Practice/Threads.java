class threding extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<50) {
            System.out.println("Doing Chores");
            i++;
        }
    }
}

class threading2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("Using Phone");
            i++;
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        threding t1 = new threding();
        threading2 t2 = new threading2();

        t1.start();
        t2.start();
    }
}
