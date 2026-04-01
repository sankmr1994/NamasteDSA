package _05_linked_list;

public class _12_merge_two_sorted_lists {
    public static void main(String[] args) {
        MyLinkedList head1List = new MyLinkedList();
        head1List.addAtTail(1);
        head1List.addAtTail(2);
        head1List.addAtTail(4);

        MyLinkedList head2List = new MyLinkedList();
        head2List.addAtTail(1);
        head2List.addAtTail(3);
        head2List.addAtTail(4);

        MyLinkedList.Node dummy = new MyLinkedList.Node(-1);
        MyLinkedList.Node current = dummy;
        MyLinkedList.Node head1Node = head1List.head;
        MyLinkedList.Node head2Node = head2List.head;

        while (head1Node != null && head2Node != null) {
            if (head1Node.val <= head2Node.val) {
                current.next = head1Node;
                head1Node = head1Node.next;
            } else {
                current.next = head2Node;
                head2Node = head2Node.next;
            }
            current = current.next;
        }

        if (head1Node == null){
            current.next = head2Node;
        }
        if (head2Node == null){
            current.next = head1Node;
        }

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = dummy.next;

        myLinkedList.printLL();
    }
}
