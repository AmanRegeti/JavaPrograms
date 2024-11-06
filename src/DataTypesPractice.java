public class DataTypesPractice {
    /*
        Primitive Data Types
        --------------------
        Data Types for the numbers without decimal
        byte = 8 bits
        short = 2 bytes
        int = 4 bytes
        long = 8 bytes

        Data types for numbers with decimal
        float - 4 bytes - 3 to 4 digits after decimal
        double - 8 bytes - many digits after decimal

        char - 2 bytes - 'a'
        boolean - true/false

        String - "Aman"

     */
    public static void main(String[] args) {
        byte b1 = 55; // range of the byte is -128 to 127
        System.out.println("b1: " + b1);

        short s1 = 34;
        System.out.println("s1: "+ s1);

        int i1 = 1034;
        System.out.println("i1:" + i1);

        long l1 =30894545363L;
        System.out.println("l1:" + l1);

        float f1 = 4232.32f;
        System.out.println("f1:" + f1);

        double d1 = 1243.43123234132d;
        System.out.println("d1:" + d1);

        int i2 =1342;
        System.out.println("Sum: " + (i1 + i2));
        int i3 = i1 + i2;

        char c1 ='a';
        System.out.println("c1:" + c1);

        boolean bl1 = false;
        System.out.println("bl1:" + bl1);

        String str= "Hi my name is Aman";
        System.out.println("str:" + str);

        // Non-primitives

        // Byte
        Byte b2 = 121;
        double d2 = (double) b2;
        System.out.println("d2: "+d2);

        // Short
        // Integer
        Integer i4 = 2124;
        float f2 = i4.floatValue();
        System.out.println("f2:"+ f2);
        // Long
        // Float
        Float f5 = 403.201f;
        int i6 = f5.intValue();
        System.out.println("sum:"+ (i6 + f2));
        // Double
        // Boolean
        // Character
        // String
    }
}
