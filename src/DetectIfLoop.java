import java.util.HashSet;

public class DetectIfLoop {
    private MyNode head = null;

    public static void main(String[] args) {


        MyNode<Integer> head = new MyNode<>(1);
        MyNode<Integer> second = new MyNode<>(2);
        MyNode<Integer> third = new MyNode<>(3);
        MyNode<Integer> fourth = new MyNode<>(1);


        head.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        fourth.setNext(head);
        if (detectLoop(head)) {
            System.out.println("There is a loop");
        } else {
            System.out.println("There is no loop");
        }


    }

    private static boolean detectLoop(MyNode<Integer> head) {
        if (head == null) {
            System.out.println("There is no loop, because there is list");
            return false;
        }
        HashSet<MyNode> checkIfLoop = new HashSet<>();
        MyNode<Integer> pointer = head;
        while (pointer.getNext() != null) {
            if (checkIfLoop.contains(pointer)) {
                return true;
            }
            checkIfLoop.add(pointer);
            pointer = pointer.getNext();
        }

        return false;

    }
}
