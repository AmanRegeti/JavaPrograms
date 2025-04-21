import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {
    private int[] a;
    // default constructor  - empty constructor without any parameters
    // If you don't have any other constructor(s), default one is implicitly added.
    // You can override a default constructor as done below.
    public MyArrayList() {
        this.a = new int[8];
    }
    //constructors are a special type of function without a return type
    //new operators create new objects
    //this, is a current object
    // e.g. MyArrayList list = new MyArrayList(10)
    // here, list is a current object
    public MyArrayList(int size) {
        this.a = new int[size];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyArrayList that = (MyArrayList) o;
        return Objects.deepEquals(a, that.a);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(a);
    }
    /*
        Object class is a parent class of all the classes.
        It has a toString() method.
        We want our own representation of toString() method.
        So, we override it.
        toString() is automatically called when you do System.out.println(list1)
     */
    @Override
    public String toString() {
        return "MyArrayList{" +
                "a=" + Arrays.toString(a) +
                '}';
    }

    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList(); // used a default constructor
        MyArrayList list2 = new MyArrayList(10); // used a parameterized constructor
        System.out.println(list1);
    }
}
