package OOPS;
interface Parent{
    void meth1();
    void meth2();
}
interface Child extends Parent{
    void meth3();
    void meth4();
}
class Uncle implements Child{
    public void meth1() {
        System.out.println("Method 1...");
    }
    public void meth2(){
        System.out.println("Method 2...");
    }
    public void meth3(){
        System.out.println("Method 3...");
    }
    public void meth4(){
        System.out.println("Method 4...");
    }
}
public class Inheritance_In_Interfaces {
    public static void main(String[] args) {
        Uncle u = new Uncle();
        u.meth1();
        u.meth2();
        u.meth3();
        u.meth4();
    }
}
