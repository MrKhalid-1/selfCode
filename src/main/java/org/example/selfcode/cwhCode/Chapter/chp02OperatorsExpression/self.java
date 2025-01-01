package org.example.selfcode.cwhCode.Chapter.chp02OperatorsExpression;

public class self {
    public static void main(String[] args) {
//
//        String[] wordListOne = {"agnostic", "opinionated",
//                "voice activated", "haptically driven", "extensible",
//                "reactive", "agent based", "functional", "AI enabled",
//                "strongly typed"};
//
//        String[] wordListTwo = {"loosely coupled", "six sigma",
//                "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless",
//                "microservices", "distributed ledger"};
//
//        String[] wordListThree = {"framework", "library",
//                "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective", "design",
//                "orientation"};
//
//        int oneLength = wordListOne.length;
//        int twoLength = wordListTwo.length;
//        int threeLength = wordListThree.length;
//
//        java.util.Random randomGenerator = new java.util.Random();
//        int rand1 = randomGenerator.nextInt(oneLength);
//        int rand2 = randomGenerator.nextInt(twoLength);
//        int rand3 = randomGenerator.nextInt(threeLength);
//        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
//
//        System.out.println("What we need is a " + phrase);
//    }

        /** output

         % java Shuffle1
         a-b c-d
         *
         */
        int x = 3;
        while (x > 0) {
            if (x == 1) {
                System.out.print("d");
                x = x - 1;
            }
            if (x == 0){
                break;
            }
            if (x > 2) {
                System.out.print("a");
            }
            x = x - 1;
            System.out.print("-");

                if (x == 2) {
                    System.out.print("b c");
                }
                if (x > 2) {
                    System.out.print("a");
                }
                x = x - 1;
                System.out.print("-");
//                System.out.println(x + "this value of x when x in the last line");

        }
    }
}
