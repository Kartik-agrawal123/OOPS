package OOPS;

import java.util.Date;

public class Date_Collection {
    public static void main(String[] args) {
     /**   System.out.println(System.currentTimeMillis());// shows milliseconds since passed away from 1 Jan 1970
        //how many seconds are passed away
       long seconds = System.currentTimeMillis()/1000;
        System.out.println(seconds);
        //how many minutes are passed away
        long minutes = seconds/3600;
        System.out.println(minutes);
        //how many hrs passed away
        int hrs = (int)minutes/24;
        System.out.println(hrs);
        //how many years are passed away
        int yrs = hrs/365;
        System.out.println(yrs);**/
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());


    }
}
