package org.example.selfcode.cwhCode.clearify.headBook;

public class self_01 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
//            case1  = y = x-y;
//          case 2  y = y + x;
//        case3    y = y + 2;
//            if( y > 4 ) {
//                y = y - 1;
//            }
//   case4         x = x + 1;
//            y = y + x;
            if ( y < 5 ) {
                x = x + 1;
                if ( y < 3 ) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}


/**
 * x = 0  (0,2)
 * x = 1 (1,4)
 * x = 2 (3,6)
 * x= 3 (8,18) 19
 * x =4 (20,38)
 */
