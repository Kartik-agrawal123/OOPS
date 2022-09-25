package OOPS;
abstract class Shape{
    Shape(){
        System.out.println("Shape of the object");
    }
    abstract public double area();
    abstract public double perimeter();
}
class Circle extends Shape{
    int radius;
    Circle(int r){
        this.radius = r;
    }
    @Override
    public double area(){
        return 3.14*radius*radius;
    }
    @Override
    public double perimeter(){
        return 2*3.14*radius;
    }
}
 abstract class Rect extends Shape{
    int length;
    int width;
    Rect(int l , int w){
        this.length = l;
        this.width  = w;
    }
}

public class Abstract {
    public static void main(String[] args) {
        Circle c = new Circle(14);
        double a = c.area();
        double p = c.perimeter();
        System.out.println(a+" "+p);


    }

}
