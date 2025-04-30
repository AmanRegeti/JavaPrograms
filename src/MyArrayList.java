import java.util.Arrays;
import java.util.Objects;

public class MyArrayList {
    private int[] a;
    private int next = 0;

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

    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList(); // used a default constructor
        MyArrayList list2 = new MyArrayList(10); // used a parameterized constructor
        System.out.println(list1);

    }

    public int get(int index) {
        // todo: handle wrong index numbers.
        return a[index];

    }

    public int put(int index, int element) {
        // todo: handle invalid index numbers
        int temp = a[index];
        a[index] = element;
        return temp;
    }

    public void add(int element) {
        // todo: expand an array, if required
        a[next] = element;
        next++;
    }
    public void expand(){
        int count=0;
        boolean change = false;
        for (int i = 0; i < a.length; i++) {
            HowManyZeros(i,count);
            boolean change= ShouldExpand(count);
        }
        if (change==true){
            
        }
    }
    private void HowManyZeros(int i,int count){
        if (i==0){
            count++;
        }
    }
    
    private boolean ShouldExpand(int count){
        if (count<=3){
            return true;
        }
        return false;
    }

    public int remove(int index) {
        // todo: handle invalid index number
        int temp = a[index];
        shiftLeft(index, a);
        // todo: contract an array, if required
        return temp;
    }
    private void shiftLeft(int index, int[] a){
        for (int i = index+1; i <= next; i++) {
            a[i-1]=a[i];
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
}
