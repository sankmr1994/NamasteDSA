package _05_linked_list;

public class _02_reverse_linked_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(3);
        myLinkedList.addAtTail(4);
        myLinkedList.addAtTail(5);

        MyLinkedList.Node current = myLinkedList.head;
        MyLinkedList.Node previous = null;

        while (current != null){
            MyLinkedList.Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        myLinkedList.head = previous;
        myLinkedList.printLL();

    }
}
