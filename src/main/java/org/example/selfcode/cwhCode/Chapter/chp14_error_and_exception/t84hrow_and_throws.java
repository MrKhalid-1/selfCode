package org.example.selfcode.cwhCode.Chapter.chp14_error_and_exception;
/* if ( b===0 ) {
    throw new ArithmeticException("Div by 0");
       }
  else{
          return a/b ;
      }
*/

/* 
      throw new My Exception ( "Exception throw" ); */

/*   public void calculate (int a, int b) throws IOException {
            // code
    }  */ 


    

 class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}



public class t84hrow_and_throws {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // Made By Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
        try{
//            int c = divide(6, 0);
//            System.out.println(c);
            double ar = area(6);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}


