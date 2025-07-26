package exceptions;

public class UncheckedExceptionPractice {
    public static void main(String[] args) {
        ArrayIndexOutOfBounds();
        try {
            NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("NUll POINTER EXCEPTION");
        }
        ArithmeticException();
    }

    private static void ArrayIndexOutOfBounds() {
        int[] a = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < a.length; i++) {
                int sumOfDoubles = a[i] + a[i + 1];


            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }
    }

    private static void NullPointerException() throws NullPointerException {
        try {
            int[] Array = null;
            System.out.println(Array.length);
        } catch (NullPointerException e) {
            throw e;
        }

    }
    private static void ArithmeticException (){
        try
        {
            int divisor = 0;
            int dividend = 24;
            int quotient = dividend / divisor;
            System.out.println(quotient);

        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            throw new UncheckedException(e);
        }
    }
    private static void RuntimeException (){
        try
        {
            int divisor = 0;
            int dividend = 24;
            int quotient = dividend / divisor;
            System.out.println(quotient);

        }

        catch (ArithmeticException e){
            System.out.println("Arithmetic Exception" +e);
        }
        catch(RuntimeException e){
            System.out.println("Runtime Exception" + e);
        }

    }
}

