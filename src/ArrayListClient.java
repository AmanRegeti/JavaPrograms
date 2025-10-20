import java.util.ArrayList;
import java.util.Date;

public class ArrayListClient {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        b[0] = 1;
        b[1] = 2;
        b[2] = 3;
        ArrayList al = new ArrayList();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(11);
        System.out.println(al);
        ArrayList pl = new ArrayList();


        Person p1 = new Person();
        p1.name = "Bob";
        p1.age = 11;
        Person p2 = new Person();
        p2.name = "Rob";
        p2.age = 12;
        Person p3 = new Person();
        p3.name = "Gob";
        p3.age = 13;
        Person p4 = new Person();
        p4.name = "Kob";
        p4.age = 14;

        pl.add(p1);
        pl.add(p2);
        pl.add(p3);
        pl.add(p4);
        System.out.println(pl);
    }
    static class Person {
        String name;
        int age;

    }
}
