public class FindMiddleNode{
    private MyNode head = null;
    public void main(String[] args) {
        MyLinkedList list= new MyLinkedList<>();
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(4);
        FindMiddle(list);

    }
    private void FindMiddle(MyLinkedList List){
        if (head == null) {
            System.out.println("There is no linked list");
            return;
        }
        MyNode pointer = head.getNext();
        while(pointer.getNext() != null){
            int amountForward= CheckLeft(pointer);
            int amountBehind= CheckFinished(pointer);
            if (amountForward == amountBehind){
                System.out.println("The middle is" + pointer);
            }
        }
    }
    private int CheckLeft(MyNode pointer){
        int i = 0;
        for (i = 0;pointer.getNext() != null; i++) {
            pointer= pointer.getNext();
        }
        return i;
    }
    private int CheckFinished(MyNode CurrentNode){
        int i = 1;
        MyNode pointer = head.getNext();
        for (i = 0; pointer.getNext() != CurrentNode.getValue(); i++) {
            pointer=pointer.getNext();
        }
        return i;
    }
}
