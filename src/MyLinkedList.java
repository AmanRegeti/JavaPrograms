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
        System.out.println("---------------------------------------------------------------------------");
        System.out.println(list);
        Integer RemovedLastValue = list.removeLast();
        System.out.println(RemovedLastValue);
        Integer RemovedLastValue2 = list.removeLast();
        System.out.println(RemovedLastValue2);
        Integer RemovedLastValue3 = list.removeLast();
        System.out.println(RemovedLastValue3);
        Integer RemovedLastValue4 = list.removeLast();
        System.out.println(RemovedLastValue4);
        Integer RemovedLastValue5 = list.removeLast();
        System.out.println(RemovedLastValue5);
        Integer RemovedLastValue6 = list.removeLast();
        System.out.println(RemovedLastValue6);
        System.out.println(list);
        System.out.println("--------------------------------------------------");
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        list2.addLast(15);
        list2.addLast(14);
        list2.addLast(13);
        list2.addLast(12);
        list2.addLast(11);
        System.out.println(list2);
        System.out.println("----------------------------------------");
        Integer removedValue = list2.removeFirst();
        System.out.println(removedValue);
        System.out.println(list2);
        Integer removedValue2 = list2.removeFirst();
        System.out.println(removedValue2);
        System.out.println(list2);
        MyLinkedList<Integer> list3 = new MyLinkedList<>();
        list3.add(0, 15);
        list3.add(0, 14);
        list3.add(0, 13);
        list3.add(0, 12);
        list3.add(0, 11);
//        System.out.println(list3.head);
//        System.out.println("-----------------Remove---------------");
//        list3.remove(2);
//       // list3.remove(0);
//       // list3.remove(0);
        System.out.println(list3);
        System.out.println("----------------Get-------------------");
        System.out.println(list3.get(2));
        System.out.println(list3.get(4));
        System.out.println(list3.get(9));
        System.out.println(list3.size());

        Person p1 = new Person();
        p1.name = "John";
        p1.age = 12.5f;
        p1.height = 5.7f;
        p1.weight = 70.5f;
        Person p2 = new Person();
        p2.name = "Bob";
        p2.age = 13.6f;
        p2.height = 6;
        p2.weight = 79.3f;
        Person p3 = new Person();
        p3.name = "Jeff";
        p3.age = 11;
        p3.height = 5.8f;
        p3.weight = 69f;
        Person p4 = new Person();
        p4.name = "Steve";
        p4.age = 13;
        p4.height = 6f;
        p4.weight = 73f;
        Person p5 = new Person();
        p5.name = "";
        p5.age = 5;
        p5.height = 3f;
        p5.weight = 50f;
        Person p6 = new Person();
        p6.name = "Jeff";
        p6.age = 11;
        p6.height = 5.8f;
        p6.weight = 69f;
        MyLinkedList<Person> list4 = new MyLinkedList<>();
        list4.addFirst(p1);
        list4.addFirst(p2);
        list4.addFirst(p3);

        System.out.println(list4);
    }


    public E removeFirst() {
        if (head == null) {
            System.out.println("There are no elements in the linked list to remove from");
            return null;
        }
        MyNode<E> prevHead = head;
        head = head.getNext();
        prevHead.setNext(null);
        return prevHead.getValue();

    }
    public E removeLast(){
        if (head == null ) {
            System.out.println("There are no elements in the linked list to remove from");
            return null;
        }

        if (head.getNext() == null){
            E temp = head.getValue();
            head=null;
            return temp;
        }
        MyNode<E> prev= null;
        MyNode<E> pointer = head;
        while(pointer.getNext() != null){
            prev = pointer;
            pointer= pointer.getNext();
        }
        E temp = pointer.getValue();
        prev.setNext(null);
        return temp;
    }

    public E remove(int index) {
        if (head == null) {
            System.out.println("There are no elements in the linked list to remove from");
            return null;
        }
        if (head.getNext() == null){
            E temp = head.getValue();
            head=null;
            return temp;
        }
        int counter = 0;
        MyNode<E> prev = null;
        MyNode<E> pointer=head;
        while (counter<index+1) {
            prev = pointer;
            pointer= pointer.getNext();
            counter++;
        }
        E temp = pointer.getValue();
        prev.setNext(pointer.getNext());
        return temp;
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
        MyNode<E> prev = null;
        MyNode<E> pointer = head;
        while (counter != index+1) {
            prev = pointer;
            pointer= pointer.getNext();
            counter++;
        }
        prev.setNext(newNode);
        newNode.setNext(pointer);
    }
    private E get(int index){
        if (head == null) {
            System.out.println("There is nothing in the list");
            return null;
        }
        int counter=0;
        MyNode<E> pointer = head;
        while(counter<index){
            counter++;
            pointer= pointer.getNext();
            if( pointer ==null){
                System.out.println("Your index is out of bounds");
                return null;
            }
        }
        return pointer.getValue();

    }
    private int size(){
        int size=1;
        MyNode element= head;
        while (element.getNext()!=null){
            size++;
            element= element.getNext();
        }
        return size;
    }
    @Override
    public String toString() {
        return "MyLinkedList{,"  + head  + "}";

    }
}