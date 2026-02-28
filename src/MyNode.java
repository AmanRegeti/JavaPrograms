import java.util.Objects;

public class MyNode<E> {
    private E value;
    private MyNode<E> next;
    public MyNode(E value) {
        this.value = value;
    }
    public MyNode(E value, MyNode<E> n) {
        this(value);
        next = n;
    }

    public E getValue() {
        return value;
    }

    public void setNext(MyNode<E> n) {
        next = n;
    }
    public MyNode<E> getNext(){
        return next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNode<?> myNode = (MyNode<?>) o;
        return Objects.equals(value, myNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

    @Override
    public String toString() {
        return value + " , " + next;
    }

    public void setNext(int node1) {

    }
}
