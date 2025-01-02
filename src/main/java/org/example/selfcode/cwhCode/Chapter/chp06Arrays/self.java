package org.example.selfcode.cwhCode.Chapter.chp06Arrays;

public class self {

    public static void main(String[] arr){
        int[] marks = new int[3];
        marks[0] = 55;
        marks[1] = 57;
        marks[2] = 59;
        // System.out.println(marks);

        int[] mas = {44,45,34,554};
        // System.out.println(mas[3]);

        for(int i = marks.length;i<=marks.length;i++){
            System.out.println(mas[i]);

            // for(int element:mas){
            //     System.out.println(element);
            // }
            for(int element: marks){
                System.out.println(element);
            }

        }
        String [] b = new String[3];
        b[0] ="lka";
        b[1] ="llkaka";
        b[2] ="lksasga";
        for(String r : b){
            // System.out.println(r);
        }
         boolean s=b[2].equals("lskal");
         System.out.println(s);
    }
    
    }