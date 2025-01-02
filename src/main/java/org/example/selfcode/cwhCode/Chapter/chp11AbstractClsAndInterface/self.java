package org.example.selfcode.cwhCode.Chapter.chp11AbstractClsAndInterface;

/*
public abstract class phone Model {
    abstract void switch off ();
     || more code
     }

     abstract class Phone{
        abstract void on();
      }
class SmartPhone extends Phone{
      void run(){
      System.out.println("Turning on...");
      }
      public static void main(String args[]){
       Phone obj = new SmartPhone();
       obj.on();
      }
      }
*/
//abstract class Phone{
//     abstract void showTime();
////       { System.out.println("Time is 8 am");}
//   abstract public void on();
////   {System.out.println("Turning on Phone...");}
//}
//
//class SmartPhone extends Phone {
//    @Override
//    public void showTime()
//           { System.out.println("Time is 8 am");}
//    @Override
//public void on(){
//               System.out.println("Turning on SmartPhone...");
//           }
//    public void music(){
//        System.out.println("Playing music...");
//    }
//
//}
/*
abstract class Phone13{
    abstract void on();
}
abstract class junu{
    abstract void runjun();
}

//   class SartPhone12 extends Phone13,junu{  --->error

   class SartPhone12 extends Phone13{

    void on(){
        System.out.println("phn a=on ho rha hai htt jao");
    }
    void run(){
        System.out.println("Turning on...");
    }}
*/
/*
interface  Phone13{
     void on();
}
interface junu{
    void runjun();
}

//class SartPhone12 implements Phone13{
//
//    public void on(){
//        System.out.println("phn jungle me mangle ho rha hai htt jao");
//    }
//    void run(){
//        System.out.println("Turning on...");
//    }}
class SartPhone12 implements Phone13,junu{
    public void runjun(){
        System.out.println("microsoft includes office hom;e and student");
    }


    public void on(){
        System.out.println("phn jungle me mangle ho rha hai htt jao");
    }
    void run(){
        System.out.println("Turning on...");
    }}

public class self{
        public static void main(String[] args) {
        SartPhone12 i = new SartPhone12();
        i.runjun();
        i.on();


//            System.out.println("morni si v=chal");
//            SartPhone12 i = new SartPhone12();
//            i.on();
//        SmartPhone obj = new SmartPhone(); // Yes it is allowed
//        obj.showTime();
//        obj.on();
    }
}
 */

interface MyCamer{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k...");
    }
}

interface MyWif{
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhon{
    void callNumber(int phoneNumber){
        System.out.println("Calling "+ phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }

}

class MySmartPhon extends MyCellPhon implements MyWif, MyCamer{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Taking snap");
    }
    //    public void record4KVideo(){
//        System.out.println("Taking snap and recoding in 4k");
//    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Harry", "Prashanth", "Anjali5G"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class self{
    public static void main(String[] args) {
        MySmartPhon ms = new MySmartPhon();
//        ms.record4KVideo();
        // ms.greet(); --> Throws an error!
        String[] ar = ms.getNetworks();
        for (String item: ar) {
            System.out.println(item);
        }
    }
}