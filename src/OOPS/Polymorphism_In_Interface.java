package OOPS;
interface GPS{
    void track();
    void show();
}
interface Camera{
    void record();
    void click();
}
interface MediaPlayer{
    void play();
    void stop();
}
class CellPhone1{
    void call(){
        System.out.println("calling!");
    }
    void disconnecting(){
        System.out.println("disconnect the call!");
    }
}
class MySmartPhone extends CellPhone implements GPS , Camera , MediaPlayer{
    public void track(){
        System.out.println("tracking the location");
    }
    public void show(){
        System.out.println("show the location of your mobile");
    }
    public void record(){
        System.out.println("record the video");
    }
    public void click(){
        System.out.println("clicking the picture");
    }
    public void play(){
        System.out.println("play the song");
    }
    public void stop(){
        System.out.println("stop the song");
    }
    void sample(){
        System.out.println("smartphone");
    }
}
public class Polymorphism_In_Interface {
    public static void main(String[] args) {
       // GPS g = new MySmartPhone();
      //  g.show();
      //  g.track();
        MySmartPhone m = new MySmartPhone();
        m.sample();
        m.play();

    }
}
