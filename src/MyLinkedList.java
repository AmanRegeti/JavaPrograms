public class MyLinkedList<E> {
    private MyNode<E> head = null;

    //todo: package
    //Overloading: 2 or more methods have the same name provided they have some difference in parameters
    //Overriding: child class inherits the methods from parent class. If child class wants to do something different in that method, it can override that method
    //(create same method with different code)
    public MyLinkedList() {

    }

    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(15);

        list.addFirst(14);
        list.addFirst(13);
        list.addFirst(12);
        list.addFirst(11);
        System.out.println(list);
        list.add(3, 20);
        System.out.println(list);
        Integer RemovedLastValue = list.removeLast();
        System.out.println(RemovedLastValue);
        Integer RemovedLastValue2 = list.removeLast();
        System.out.println(RemovedLastValue);
        Integer RemovedLastValue3 = list.removeLast();
        System.out.println(RemovedLastValue);
        System.out.println(list);

        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.addLast(15);
        list2.addLast(14);
        list2.addLast(13);
        list2.addLast(12);
        list2.addLast(11);
        System.out.println(list2);

        Integer removedValue = list2.removeFirst();
        System.out.println(removedValue);
        System.out.println(list2);
        Integer removedValue2 = list2.removeFirst();
        System.out.println(removedValue2);
        System.out.println(list2);
    }

    public E removeFirst() {
        if (head == null) {
            System.out.println("There is no Linked List or elements in the linked list to remove from");
            return null;
        }
        MyNode<E> prevHead = head;
        head = head.getNext();
        prevHead.setNext(null);
        return prevHead.getValue();

    }
    public E removeLast(){
        if (head == null) {
            System.out.println("There is no Linked List or elements in the linked list to remove from");
            return null;
        }
        MyNode<E> pointer = head.getNext();
        MyNode<E> prev = head;

        while(pointer.getNext() != null){
            pointer= pointer.getNext();
            prev=prev.getNext();
        }
        E temp = pointer.getValue();
        prev.setNext(null);
        return temp;
    }
    public void remove(int index) {

    }

    public void addFirst(E element) {
        MyNode<E> newNode = new MyNode<>(element);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(E element) {
        MyNode<E> newNode = new MyNode<>(element);
        if (head == null) {
            head = newNode;
            return;
        }
        MyNode<E> pointer = head;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }
        pointer.setNext(newNode);
    }

    public void add(int index, E element) {
        MyNode<E> newNode = new MyNode<>(element);
        if (head == null) {
            head = newNode;
            return;
        }

        int counter = 0;
        MyNode<E> pointer = head;
        while (counter != index - 1) {
            pointer = pointer.getNext();
            counter++;
        }
        newNode.setNext(pointer.getNext());
        pointer.setNext(newNode);
    }
    @Override
    public String toString() {
        return "MyLinkedList{"  + head + "," + "}";

    }
}