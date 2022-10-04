package OOPS;

import java.util.Scanner;

class Custom1 extends Exception{
    @Override
    public String toString() {
        return "OH! NO EXCEPTION";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
public class CustomExcep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a<8){
            try {
                throw new Custom1();
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e.getStackTrace());
            }
        }
    }
}
