package OOPS;
class RadiusNegative extends Exception{
    @Override
    public String toString() {
        return "Radius cannot negative";
    }
}

public class throwAndThrows {
    static double area(int r) throws RadiusNegative{
       if(r<0){
            throw new RadiusNegative();
        }
        double result = Math.PI*r*r;
        return result;
    }
   static int divide(int a , int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }
    public static void main(String[] args){
       try {
           int c = divide(6, 0);
           System.out.println(c);
       }catch (Exception e){
           System.out.println(e);
       }
        double c = 0;
        try {
            c = area(-6);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
