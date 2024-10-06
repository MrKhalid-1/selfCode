package org.example.selfcode.cwhCode.Chapter.chp15_advance_java1.date_and_time;

import java.util.Date;

// public class CWH extends Thread{
//     public static void main(String[] args) {
//         System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
//         System.out.println("The value of current time in ms : " + System.currentTimeMillis());
//     }
// }


public class d97ateclass {

    public static void main(String[] args) {
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(System.currentTimeMillis());
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()); 
    }

}