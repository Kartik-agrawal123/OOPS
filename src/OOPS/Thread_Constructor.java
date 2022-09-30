package OOPS;
/**class Const1 extends Thread{
    public Const1(String name){
        super(name);
    }
    public void run(){
        System.out.println("constructor1");
    }
}*/
class Const2 implements Runnable{
    public void run(){
        System.out.println("Constructor2");
    }
    Const2(String name){
        super();
    }
}
public class Thread_Constructor {
    public static void main(String[] args) {
       /** Const1 c = new Const1("kartik");
        c.start();
        System.out.println(c.getId());
        System.out.println(c.getName());*/
       Const2 c = new Const2( "kartik");
        Thread t1 = new Thread(c);
       Const2 c1 = new Const2("agrawal");
        Thread t2 = new Thread(c1);
        t1.start();
        t2.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getId());
        System.out.println(t2.getName());

    }
}
