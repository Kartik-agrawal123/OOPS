package OOPS;
class MyRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<5) {
            System.out.println("I am runnable1");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int j = 0;
        while(j<5){
            System.out.println("I am runnable2");
            j++;
        }
    }
}

public class MyRunnable {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
