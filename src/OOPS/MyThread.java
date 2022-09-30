package OOPS;
class MyThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
            System.out.println("Thread1 is running");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int j = 0;
        while(j<50){
            System.out.println("Thread2 is running");
            j++;
        }
    }
}
class MyThread3 extends Thread{
    public void run(){
        int r = 0;
        while(r<50){
            System.out.println("Thread3 is running");
            r++;
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        MyThread3 t3 = new MyThread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
