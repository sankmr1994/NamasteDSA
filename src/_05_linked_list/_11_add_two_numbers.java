package _05_linked_list;

public class _11_add_two_numbers {
    public static void main(String[] args) {
        MyLinkedList head1MyLinkedList = new MyLinkedList();
        head1MyLinkedList.addAtTail(2);
        head1MyLinkedList.addAtTail(4);
        head1MyLinkedList.addAtTail(3);

        MyLinkedList head2MyLinkedList = new MyLinkedList();
        head2MyLinkedList.addAtTail(5);
        head2MyLinkedList.addAtTail(6);
        head2MyLinkedList.addAtTail(4);


        MyLinkedList.Node head1 = head1MyLinkedList.head;
        MyLinkedList.Node head2 = head2MyLinkedList.head;
        MyLinkedList.Node sumList = new MyLinkedList.Node(-1);
        int carry = 0;
        while (head1 != null && head2 != null) {
            int head1Val = head1.val;
            int head2Val = head2.val;
            int sum = head1Val + head2Val + carry;
            int lastDigit = sum % 10;
            MyLinkedList.Node sumNode = new MyLinkedList.Node(lastDigit);
            sumNode.next = sumList;
            sumList = sumNode;
            carry = sum / 10;
            head1 = head1.next;
            head2 = head2.next;
        }

        while (head1 != null) {
            int head1Val = head1.val;
            int sum = head1Val + carry;
            int lastDigit = sum % 10;
            MyLinkedList.Node sumNode = new MyLinkedList.Node(lastDigit);
            sumNode.next = sumList;
            sumList = sumNode;
            carry = sum / 10;
            head1 = head1.next;
        }

        while (head2 != null) {
            int head2Val = head2.val;
            int sum = head2Val + carry;
            int lastDigit = sum % 10;
            MyLinkedList.Node sumNode = new MyLinkedList.Node(lastDigit);
            sumNode.next = sumList;
            sumList = sumNode;
            carry = sum / 10;
            head2 = head2.next;
        }
        if (carry != 0) {
            MyLinkedList.Node sumNode = new MyLinkedList.Node(carry);
            sumNode.next = sumList;
            sumList = sumNode;
        }

        MyLinkedList mNode = new MyLinkedList();
        mNode.head = sumList;

        mNode.printLL();

        // reverse final list
        MyLinkedList.Node current = sumList;
        MyLinkedList.Node previous = null;

        while (current != null) {
            MyLinkedList.Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        mNode.head = previous.next;

        mNode.printLL();

    }
}
