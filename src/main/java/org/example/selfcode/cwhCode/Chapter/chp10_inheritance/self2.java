package org.example.selfcode.cwhCode.Chapter.chp10_inheritance;
class phonix {
    public void call(){
        System.out.println("phone has ringing");
    }
    public String net(){
        return "phone has no net";
    }
    public void memo(){
        System.out.println("phone has also memory card");
    }
}
class smart extends phonix{
     public void cem(){
        System.out.println("phone has also pic quality");
    }
    public String cal(){
        return "phone has no cal as standerd level";
    }
    public void memo(){
        System.out.println("Smartphone has also memory card");
    }
        }

public class self2 {
    public static void main(String[] args) {
//        phonix nokia = new phonix();
        smart io = new smart();
//        phonix cp = new smart();
        io.call();
        System.out.println(io.net());
        io.cem();
        System.out.println(io.cal());
        io.memo();
    }
}
