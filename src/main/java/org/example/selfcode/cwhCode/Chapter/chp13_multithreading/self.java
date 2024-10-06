package org.example.selfcode.cwhCode.Chapter.chp13_multithreading;

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class self {
    public static void main(String[] args) {
        // Using Thread class
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();

        // Using Runnable interface
        Thread t3 = new Thread(new MyRunnable());
        Thread t4 = new Thread(new MyRunnable());
        t3.start();
        t4.start();
    }
}
