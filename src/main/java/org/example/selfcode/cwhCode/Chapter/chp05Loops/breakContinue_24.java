package org.example.selfcode.cwhCode.Chapter.chp05Loops;

public class breakContinue_24 {
    
    // public static void main(String[] args) {  
    //     //using for loop  
    //     for(int i=10;i>0;i--){  
    //         if(i==7){  
    //             break;   //break the loop
    //         }  
    //         System.out.println(i);  
    //     }  
    // }  
    // }  
    
    // public class CWH_continue {  
    //     public static void main(String[] args) {  
         
    //         for(int i=7;i>0;i--){  
    //             if(i==3){  
    //                 continue;//continue skips the rest statement
    //             }  
    //             System.out.println(i);  
    //         }  
    //     }  

    public static void main(String[] args) {
        // Break and continue using loops!
//        for (int i=0;i<50;i++){
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ends here");


//            for(int i=0;i<50;i++){
//            if(i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//                System.out.println(i);
//                System.out.println("Java is great");
//        }
        int i=0;
        do{
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");

        }while(i<5);
        System.out.println("Loop ends here");
    }
}

