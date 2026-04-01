package _05_linked_list;

public class _10_odd_even_linked_list {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(2);
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(3);
//        myLinkedList.addAtTail(5);
//        myLinkedList.addAtTail(6);
//        myLinkedList.addAtTail(4);
//        myLinkedList.addAtTail(7);

        MyLinkedList.Node head1 = myLinkedList.head;
        MyLinkedList.Node head2 = head1.next;
        MyLinkedList.Node oddLink = head1;
        MyLinkedList.Node evenLink = head2;

        while (evenLink != null && evenLink.next != null && oddLink != null && oddLink.next != null) {
            oddLink.next = evenLink.next;
            oddLink = oddLink.next;
            evenLink.next = oddLink.next;
            evenLink = evenLink.next;
        }

        oddLink.next = head2;
        myLinkedList.head = head1;
        myLinkedList.printLL();

    }
}
