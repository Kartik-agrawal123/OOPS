package OOPS;
/** Q.1 class Employee{
 int salary;
 String name;
 public int getSalary(){
 return salary;
 }
 public void setName(String s){
 this.name = s;
 }
 public String getName(){
 return name;
 }
 }*/
/** Q.2 class cellPhone{
 public void ring(){
 System.out.println("ringing!");
 }
 public void vibrate(){
 System.out.println("vibrating!");
 }
 }*/
/** Q.3 class Square{
 int side;
 public void setSide(int n){
 this.side = n;
 }
 public int area(){
 return side*side;
 }
 public int perimeter(){
 return 4*side;
 }
 } */
/** Q.4 class circle{
 double radius;
 public void setRadius(int n){
 this.radius = n;
 }
 public double area(){
 return 3.14*radius*radius;
 }
 public double perimeter(){
 return 2*3.14*radius;
 }
 }*/
class TommyVecetti{
    public void hit(){
        System.out.println("hitting!");
    }
    public void run(){
        System.out.println("running!");
    }
    public void fire(){
        System.out.println("firing!");
    }
}
public class Practice_OOPs {
    public static void main(String[] args) {
        /** Q.1 Employee emp1 = new Employee();
         Employee emp2 = new Employee();
         emp1.salary = 25000;
         emp2.salary = 70000;
         //emp1.name = "sarthak";
         System.out.println(emp1.getSalary());
         emp1.setName("anand");
         System.out.println(emp1.getName());
         System.out.println(emp2.getSalary());
         emp2.setName("vandana");
         System.out.println(emp2.getName());*/
        /** Q.2 cellPhone cp = new cellPhone();
         cp.ring();
         cp.vibrate(); */
        /** Q.3 Square sq = new Square();
         sq.setSide(10);
         int a = sq.area();
         int p =sq.perimeter();
         System.out.println(a+" "+p); */
        /** Q.4  circle c= new circle();
         c.setRadius(10);
         double a = c.area();
         double p = c.perimeter();
         System.out.println(a+" "+p);*/
        TommyVecetti tv = new TommyVecetti();
        tv.hit();
        tv.run();
        tv.fire();


    }
}

