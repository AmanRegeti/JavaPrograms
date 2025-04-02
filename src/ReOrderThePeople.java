import java.util.Arrays;

//move elements that are not in order to the other side
public class ReOrderThePeople {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bob";
        p1.height = 2f;
        p1.age = 1;
        p1.weight = 180;
        Person p2 = new Person();
        p2.name = "Jeff";
        p2.height = 3;
        p2.age = 2;
        p2.weight = 100;
        Person p3 = new Person();
        p3.name = "Barry";
        p3.height = 3.4f;
        p3.age = 7;
        p3.weight = 47;
        Person p4 = new Person();
        p4.name = "Liam";
        p4.height = 4;
        p4.age = 8;
        p4.weight = 30;
        Person p5 = new Person();
        p5.name = "Theodore";
        p5.height = 6;
        p5.age = 20;
        p5.weight = 125;
        Person p6 = new Person();
        p6.name = "Oliver";
        p6.height = 6.10f;
        p6.age = 40;
        p6.weight = 47;Person[] people = {p3, p4, p5, p6, p1, p2};

        reOrder(people);
        System.out.println(Arrays.toString(people));
    }

    private static void reOrder(Person[] people) {
        Person temp= people[people.length-1];
        ShiftRight(people);
        people[0]= temp;
        Person temp2= people[people.length-1];
        ShiftRight(people);
        people [0]= temp;
    }
    private static void ShiftRight(Person[] people){
        for (int i = 0, j = i + 1; j < people.length; i++,j++) {
            people[j]=people[i];
        }


    }
}
