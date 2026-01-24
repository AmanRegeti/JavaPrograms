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


    private void indexof(MyNode<E> next) {

    }

    public void setNext(MyNode<E> n) {
        next = n;
    }
    public MyNode<E> getNext(){
        return next;
    }
   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, next);
    }*/

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
