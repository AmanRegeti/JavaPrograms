public class FindMiddleNode{
    public static void main(String[] args) {
        MyLinkedList list= new MyLinkedList<>();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(6);
//        FindMiddle(list);

    }
//    private static void FindMiddle(MyLinkedList list){
//        if (head == null) {
//            System.out.println("There is no linked list");
//            return;
//        }
//        MyNode pointer = head.getNext();
//        while(pointer.getNext() != null){
//            int amountForward= CheckLeft(pointer);
//            int amountBehind= CheckFinished(pointer);
//            if (amountForward <= amountBehind){
//                System.out.println("The middle is" + pointer);
//            }
//        }
//    }
//    private static int CheckLeft(MyNode pointer){
//        int i = 0;
//        for (i = 0;pointer.getNext() != null; i++) {
//            pointer= pointer.getNext();
//        }
//        return i;
//    }
//    private static int CheckFinished(MyNode CurrentNode){
//        int i = 1;
//        MyNode pointer = head.getNext();
//        for (i = 0; pointer.getNext() != CurrentNode.getValue(); i++) {
//            pointer=pointer.getNext();
//        }
//        return i;
//    }
//private static void FindMiddle(MyLinkedList list){
//        MyNode head= list.getNode(0);
//    if (list.get(0) == null) {
//        System.out.println("There is no linked list");
//        return;
//    }
//    MyNode pointer = head;
//    while(pointer.getNext() != null){
//        int amountForward= CheckLeft(pointer);
//        int amountBehind= CheckFinished(pointer, head);
//        if (amountForward <= amountBehind){
//            System.out.println("The middle is " + pointer. getValue());
//            return;
//        }
//        pointer= pointer.getNext();
//    }
//}
//    private static int CheckLeft(MyNode pointer){
//        int i = 0;
//        for (i = 0;pointer.getNext() != null; i++) {
//            pointer= pointer.getNext();
//        }
//        return i;
//    }
//    private static int CheckFinished(MyNode CurrentNode, MyNode head){
//        int i = 0;
//        MyNode pointer = head;
//        for (i = 0;  pointer != CurrentNode; i++) {
//
//pointer= pointer.getNext();
//        }
//        return i;
//    }

    private static void TwoPointerMethod(MyLinkedList list) {
        MyNode p1= list.head;
        MyNode p2= list.head;
        while(p2.getNext() != null && p2.getNext() != null){
            p1=p1.getNext();
            p2=p2.getNext();
            if (p2 == null) {

            }
        }
    }
}
