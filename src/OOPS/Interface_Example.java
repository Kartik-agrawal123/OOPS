package OOPS;
interface MyCamera{
    void gettingPic();
    void takeSnap();
    private void greet2(){
        System.out.println("good night");
    }
    default void greet(){
        System.out.println("goood morning INDIA...");
    }
}
interface wifi{
    void gettingNetwork();
    void connectNetwork();
}
class CellPhone{
    void calling(){
        System.out.println("Calling.....");
    }
    void disconnecting(){
        System.out.println("Disconnect the call...");
    }
}
class SmartPhone extends CellPhone implements wifi , MyCamera{
    public void gettingPic() {
        System.out.println("Click Click");
    }
    public void takeSnap(){
        System.out.println("Snaping");
    }
    public void gettingNetwork() {
        System.out.println("Networking");
    }
    public void connectNetwork(){
        System.out.println("Connect");
    }

}

public class Interface_Example {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.greet();
        sp.calling();
        sp.disconnecting();
        sp.gettingPic();
        sp.takeSnap();
    }
}
