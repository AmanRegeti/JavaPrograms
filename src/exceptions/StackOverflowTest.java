package exceptions;
//stack is a LIFO (last in first out).
//Queue is a FIFO (first in first out).
//Stack is used to store function calls and exception trace.
//Stack overflow is an error which comes up when the stack is full, e.g. recursive method calls
public class StackOverflowTest {
    public static void main(String[] args) {
        m1();
    }
    private static void m1(){
        System.out.println("Hello");
        m1();
    }
}

