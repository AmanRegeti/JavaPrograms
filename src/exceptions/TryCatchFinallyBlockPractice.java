package exceptions;

import java.io.FileNotFoundException;

public class TryCatchFinallyBlockPractice {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        try
        {
            int divisor = 0;
            int dividend = 24;
            int quotient = dividend / divisor;
            System.out.println(quotient);

        }
        catch(ArithmeticException e){
            System.out.println("you can't divide by 0");
        }
        try {
            ArrayException(a);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("error");
        }
    }
    private static void ArrayException(int[] a)  throws ArrayIndexOutOfBoundsException{
        try{
            System.out.println(a[10]);
        } catch (RuntimeException e) {
            System.out.println("Error");
            throw e;
        }
    }
}
