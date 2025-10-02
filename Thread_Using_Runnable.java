class star1 implements Runnable{
        public void run(){
            int i = 0;
            while(i<100){
                System.out.println("Running Thread 1...");
                i++;
            }
    }
}

class star2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Running Thread 2...");
            i++;
        }
    }
}

public class Thread_Using_Runnable {
    public static void main(String[] args) {
        star1 st = new star1();
        Thread th = new Thread(st);

        star2 st2 = new star2();
        Thread th2 = new Thread(st2);

        th.start();
        th2.start();
    }
}