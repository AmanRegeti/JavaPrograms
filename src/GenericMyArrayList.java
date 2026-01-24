import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
public class GenericMyArrayList<E> {
    private E[] a;
    private int next = 0;

    // default constructor  - empty constructor without any parameters
    // If you don't have any other constructor(s), default one is implicitly added.
    // You can override a default constructor as done below.
    public GenericMyArrayList() {
        this.a = (E[]) new Object[8];
    }

    // constructors are a special type of function without a return type
    // new operators create new objects
    // this, is a current object
    // e.g. MyArrayList list = new MyArrayList(10)
    // here, list is a current object
    public GenericMyArrayList(int size) {
        this.a = (E[])new Object[size];
    }

    public static void main(String[] args) {
        //GenericMyArrayList<Integer> list1 = new GenericMyArrayList<>(); // used a default constructor
        GenericMyArrayList<Integer> list2 = new GenericMyArrayList<>(8); // used a parameterized constructor
        //System.out.println(list1);
        list2.add(11);
        list2.add(12);
        list2.add(13);
        list2.add(14);
        list2.add(15);
        list2.add(16);
        System.out.println("After add");
        System.out.println(list2);
        list2.remove(0);
        list2.remove(0);
        list2.remove(0);
        list2.remove(0);
        list2.remove(0);
        list2.remove(0);

        System.out.println("After remove");
        System.out.println(list2);
        list2.add(11);
        list2.add(12);
        System.out.println(list2);
        int element =0;
        int index2= 1000;
        try {
            element =list2.get(index2);
        } catch (MyInvalidIndexException e) {
            System.out.println("Index "+index2+" is not valid. " + e);
            //throw e;
        }
        System.out.println(element);
        int index= 7;
        try {
            list2.put(7, 52149);
        } catch (MyInvalidIndexException e) {
//            System.out.println("Index "+index+" is not valid");
        }
        System.out.println(list2);

        GenericMyArrayList<String> list3 = new GenericMyArrayList<>(8);
        list3.add("abc");
        //list3.add(11); // Integer is not allowed

        // Java's ArrayList
        List<Integer> list4 = new ArrayList<>();

    }

    public E get(int index) throws MyInvalidIndexException {
        if(!isValidIndex(index)) {
            throw new MyInvalidIndexException("Passed Index number is not valid. Please check.");
        }

        return a[index];

    }


    public E put(int index, E element) throws MyInvalidIndexException {
        if(!isValidIndex(index)) {
            try {
                throw new MyInvalidIndexException("Invalid Index Exception");
            } catch (MyInvalidIndexException e) {

                throw e;

            }
        }

        E temp = a[index];
        a[index] = element;
        return temp;
    }

    public void add(E element) {
        expand();
        a[next] = element;
        next++;
    }

    public void expand() {
        boolean change = shouldExpand();
        if (change == true) {
            E[] b = (E[])new Object[a.length * 2];
            copy(a, b);
            a = b;
        }
    }

    private void copy(E[] a, E[] b) {
        for (int i = 0; i < next; i++) {
            b[i] = a[i];
        }
    }

    private boolean shouldExpand() {
        int blankSpaces = ((a.length - 1) - next) + 1;
        if (blankSpaces <= 3) {
            return true;
        }
        return false;
    }

    public E remove(int index) {
        if(!isValidIndex(index)) {
            try {
                throw new MyInvalidIndexException("Index "+index+" is not valid");
            } catch (MyInvalidIndexException e) {
                System.out.println("Index "+index+" is not valid");

            }
        }

        E temp = a[index];
        shiftLeft(index, a);
        next--;
        if (shouldcontract()) {
            contraction();
        }
        return temp;

    }

    private boolean shouldcontract() {
        int blankSpaces = a.length - next;
        if (blankSpaces >= ((a.length / 2) + 3)) {
            return true;
        }
        return false;
    }

    private void contraction() {
        E[] b = (E[])new Object[a.length  / 2];
        copy(a, b);
        a = b;
    }

    private void shiftLeft(int index, E[] a) {
        for (int i = index + 1; i <= next; i++) {
            a[i - 1] = a[i];
        }
    }

    /*
    The equals checks if the two are equal
    p1.equals(p2) would check if p1 is equal to p2

    The hashcode is an easy way to store and find an element in a limited space array

     */
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
    private boolean isValidIndex(int index){
        return (index >= 0 && index <= next - 1);
    }

}
