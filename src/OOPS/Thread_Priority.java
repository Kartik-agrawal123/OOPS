package OOPS;
class Priority1 extends Thread{
 public Priority1(String name){
 super(name);
 }
 public void run(){
int i = 0;
while(i<10){
    System.out.println(this.getName());
    i++;
}
 }
 }
public class Thread_Priority {
    public static void main(String[] args) {
    Priority1 p1 = new Priority1("kartik");
    Priority1 p2 = new Priority1("harry");
    p1.start();
    p2.start();
    p1.setPriority(Thread.NORM_PRIORITY);
    p2.setPriority(Thread.MIN_PRIORITY);

    }
}
