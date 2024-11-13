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
        /*
            a++ and ++a are the same
            b=a++ would make b=a and a=a+1
            b=++a would make a=a+1 b=a
         */
        int i3 = ++a;
        int i2 = a++;
        System.out.println("i2:" +i2);
        System.out.println("i3: " +i3);

        int i4 = --a;
        System.out.println("i4: " + i4);
        System.out.println("a: "+a);

        int i5 = a--;
        System.out.println("i5: " + i5);
        System.out.println("a: "+a);

        int c= ++a;
        System.out.println("c: " + c);
        System.out.println("a: "+a);

        int d = a++;
        System.out.println("d: " + d);
        System.out.println("a: "+a);

        // +=, -=, *=, /=
        /*
        v += 4 is same as v = v+4
        v -= 4 is same as v = v-4
        v *= 4 is same as v = v*4
        v /= 4 is same as v = v/4
         */

        int e = 32;
        e+=4;
        System.out.println("e: "+e);

        e-=26;
        System.out.println("e :" +e);

        e*=53;
        System.out.println("e :" +e);

        e/=16;
        System.out.println("e :" +e);

        // >, <, >=, <=
        /*
        d>33 means is d greater than 33
        d<33 means is d less than 33
        d>=33 means is d greater than or equal to 33
        d<=33 means is d less than or equal to 33
         */
        byte f = 31;
        boolean g = f> 24;
        System.out.println("g:" + g);
        boolean b1 = f<232;
        System.out.println("b1:" + b1);
        boolean b2 = f<=31;
        System.out.println("b2:" + b2);
        boolean b3 = f>= 63;
        System.out.println("b3:" + b3);

        // Logical  Operators. Returns boolean.
        // &&, ||, !, ==, !=
        // and, or, not, equals, not equals
        int aa = 10;
        int bb = 20;
        // AND operator (&&)
        // T && T = T
        // T && F = F
        // F && T = F
        // F && F = F
        boolean r1 = aa == 10 && bb == 20; // true
        boolean r2 = aa != 10 && bb == 20; // false

        // OR operator (||)
        // T || T = T
        // T || F = T
        // F || T = T
        // F || F = F
        boolean r3 = aa == 10 || bb == 30; // true

        // NOT operator(!)
        boolean r4 = !(aa == 10 && bb == 20); // false

        // NOT EQUAL (!=)
        boolean r5 = aa != 20;  // true

        boolean r6 = aa == 5*2;
        System.out.println("r6:" + r6);
    }
}
