package OOPS;
interface Cycle{
    void speedIncrease(int speed , int increase);
    void speedDecrease(int speed , int decrease);
}
interface MotorCycle{
    void blowHorn();
    void blowHorn1();
}
class Hero implements Cycle , MotorCycle{
    int speed;
    int increase;
    int decrease;
     @Override
     public void speedIncrease(int speed, int increase){
         speed = speed + increase;
         System.out.println(speed+" speed at increase");
     }
     public void speedDecrease(int speed , int decrease){
         speed = speed - decrease;
         System.out.println(speed+" speed at decrease");
     }
    public void blowHorn(){
        System.out.println("Peee Peee");
    }
    public void blowHorn1(){
        System.out.println("Poo Poo");
    }

}

public class Interface {
    public static void main(String[] args) {
    Hero h = new Hero();
    h.speedIncrease(25,12);
    h.speedDecrease(25,12);
    }

}
