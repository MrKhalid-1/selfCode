package org.example.selfcode.cwhCode.Chapter.chp13_multithreading;
 /*
        class ThreadExample{
            public static void main(String[] args) {
                Func1();
                Func2();
            }
        }
        class Multi extends Thread{
            public void run(){
            System.out.println("thread is running...");
            }
            public static void main(String args[]){
            Multi func1=new Multi();
            func1.start();
            Multi func2=new Multi();
            func2.start();
             }
            }

            class MyThread extends Thread{
                @Override
                public void run(){
                                      //code that we want to get executed on running the thread
                    }
                }
                class MyThread extends Thread{
                    @Override
                    public void run(){
                        int i =0;
                        while(i<40000){
                            System.out.println("My Cooking Thread is Running");
                            System.out.println("I am happy!");
                            i++;
                        }
                    }
                }
                public class cwh_70 {
                    public static void main(String[] args) {
                    MyThread t1 = new MyThread();
                    t1.start();
                    }
                }
  */


        class MyThread1 extends Thread {
            @Override
            public void run() {
                int i = 0;
                while (i < 40000) {
                    System.out.println("My Cooking Thread is Running");
                    System.out.println("I am happy!");
                    i++;
                }
            }
        }

        class MyThread2 extends Thread {
            @Override
            public void run() {
                int i = 0;
                while (i < 40000) {
                    System.out.println("Thread 2 for Chatting with her");
                    System.out.println("I am sad!");
                    i++;
                }
            }
        }

        public class c70reate_thread_byexist_thread {

            public static void main(String[] args) {
                MyThread1 t1 = new MyThread1();
                MyThread2 t2 = new MyThread2();
                t1.start();
                t2.start();

            }
}
