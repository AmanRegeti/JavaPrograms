public class OperatorsPractice {
    public static void main(String[] args) {
        // +, -, *, /
        int a = 10;
        int b = 20;
        int sumResult = a + b;
        System.out.println("sumResult: " + sumResult);
        int differ = a -b ;
        int quotient= b/a;
        int product= a * b ;
        System.out.println("differ :"+differ);
        System.out.println("quotient:" + quotient);
        System.out.println("product:" + product);
        // %
        int i1 = b % 2;
        System.out.println("i1:"+ i1);

        // ++, --
        int i2 = a++;
        int i3 = ++a;
        System.out.println("i2:" +i2);
        System.out.println("i3: " +i3);
        // +=, -=, *=, /=

        // >, <, >=, <=

        // &&, ||, !, ==, !=
        // and, or, not, equals, not equals
    }
}
