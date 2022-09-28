package OOPS;
/** Q.6 , Q.7 interface TVRemote extends smartTvRemote{
    void simple();
    void channel();
}
interface smartTvRemote{
    void smart();
    void expert();
}
class TV implements TVRemote{
    public void expert() {
        System.out.println("expert remote");
    }
    public void smart(){
        System.out.println("smart tv");
    }
    public void simple(){
        System.out.println("simple remote");
    }
    public void channel(){
        System.out.println("channel");
    }
}*/
/** Q.4 abstract class telephone{
    abstract void lift();
    abstract void disconnected();
}
class smartTelephone extends telephone{
    void lift(){
        System.out.println("lifting the call");
    }
    void disconnected(){
        System.out.println("disconnecting the call");
    }
    void music(){
        System.out.println("play music");
    }
}*/
/** Q.3 , Q.5  interface basicAnimal{
    void eat();
    void sleep();
}
class Monkey{
    void jump(){
        System.out.println("jump from one tree to another...");
    }
    void bite(){
        System.out.println("bitting food...");
    }
}
class human extends Monkey implements basicAnimal{
    public void eat(){
        System.out.println("eating");
    }
    public void sleep(){
        System.out.println("sleeping");
    }
}*/
/** Q.1 , Q.2 abstract class Pen{
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Use pen for writing purpose");
    }
    void refill(){
        System.out.println("refillling the pen");
    }
    void Nib(){
        System.out.println("Change the nib ");
    }
}*/
public class Practice_Abstract_Interface {
    public static void main(String[] args) {
     /** Q.6 , Q.7   TV t = new TV();
        t.channel();
        t.expert();
        t.simple();
        t.smart(); */

       /** Q.1 ,Q.2  FountainPen fp = new FountainPen();
        fp.Nib();
        fp.refill();
        fp.write(); */
 /** Q.3 , Q.5  //  basicAnimal ba = new human();
   // ba.eat();
    //ba.sleep();
       // Monkey m = new human();
        //m.jump();
        //m.bite();
        human h = new human();
        h.eat();
        h.bite();*/
    /** Q.4 telephone t = new smartTelephone();
    t.lift();
    t.disconnected();*/

    }
}
