package OOPS;
/*** Q1 - Q.3 class Cylinder{
    int radius;
    int height;
    public Cylinder(int r , int h){
        radius = r;
        height = h;
    }
   /** public void setRadius(int r){
        this.radius = r;
    }
    public void setHeight(int h){
        this.height = h;
    }
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height;
    }
    public double surface(){
        return(2*3.14*radius*(radius + height));
    }
    public double volume(){
        return 3.14*radius*radius * height;
    }
        }***/
class Rectangle{
    int length;
    int breadth;
    public Rectangle(){
        length = 10;
        breadth = 10;
    }
    public Rectangle(int l , int b){
        length = l;
        breadth = b;
    }
    public int area(int length,int breadth){
        return length*breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Practice_getSet {
    public static void main(String[] args) {
    /** Q.1 - Q.3     Cylinder c = new Cylinder(25,10);
        // c.setRadius(25);
       // c.setHeight(10);
        //System.out.println(c.getRadius()+" "+c.getHeight());
        double s = c.surface();
        double v = c.volume();
        System.out.println(s+" "+v); */
        Rectangle r = new Rectangle(5,5);
        int l1 = r.getLength();
        int b1 = r.getBreadth();
        System.out.println(r.area(l1,b1));

    }
}
