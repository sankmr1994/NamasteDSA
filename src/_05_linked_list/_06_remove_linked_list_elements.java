package _05_linked_list;

public class _06_remove_linked_list_elements {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(2);
//        myLinkedList.addAtTail(6);
//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(3);
//        myLinkedList.addAtTail(4);
//        myLinkedList.addAtTail(5);
//        myLinkedList.addAtTail(6);
//        myLinkedList.addAtTail(1);
//        myLinkedList.addAtTail(1);
        int val = 1;

        MyLinkedList.Node previous = new MyLinkedList.Node(-1);
        MyLinkedList.Node current = myLinkedList.head;
        previous.next = current;
        while (current != null) {
            if (current.val == val) {
                if (previous.val == -1) {
                    myLinkedList.head = myLinkedList.head.next;
                }
                previous.next = current.next;
            } else {
                previous = previous.next;
            }
            current = current.next;

        }
        if (previous.val == -1) {
            myLinkedList.head = null;
        }
        myLinkedList.printLL();


    }
}
