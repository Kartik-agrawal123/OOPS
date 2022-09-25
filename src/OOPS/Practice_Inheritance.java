package OOPS;
class Rectanglee{
    int length;
    int width;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int area(){
        return length*width;
    }
    public int perimeter(){
        return 2*(length + width);
    }
}
class Cuboid extends Rectanglee{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public int area1(){
        return 2*(length*width + width*height + length*height);
    }
    public int volume(){
        return length*width*height;
    }

}
/** Q.1 , Q.3 class Circle{
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
class Cylinder extends Circle{
    int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double area1(){
        return (2*3.14*radius*(radius  + height));
    }
}*/

public class Practice_Inheritance {
    public static void main(String[] args) {
       /** Q.1 , Q.3  Circle c = new Circle();
        c.setRadius(14);
        double a = c.area();
        double p = c.perimeter();
        System.out.println(a+" "+p);
        Cylinder cy = new Cylinder();
        cy.setRadius(12);
        cy.setHeight(10);
        double a1 = cy.area1();
        System.out.println(a1); */
       Rectanglee r = new Rectanglee();
       r.setLength(10);
       r.setWidth(12);
       int a = r.area();
       int p = r.perimeter();
        System.out.println(a+" "+p);
        Cuboid c = new Cuboid();
        c.setLength(10);
        c.setWidth(12);
        c.setHeight(15);
        int a1 = c.area1();
        int v = c.volume();
        System.out.println(a1+" "+v);
    }
}
